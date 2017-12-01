package slogo.instruction;

import slogo.*;
import slogo.expression.ArithmeticBase;

/**
 * An AST (abstract syntax tree) for a SLogo REPEAT instruction. A REPEAT
 * instruction has two components: (1) an expression representing the number of
 * times to repeat the instructions that follow and (2) a
 * <em>strict instruction list</em> that is the list of instructions that will
 * be (repeatedly) executed.
 * <p>
 * To evaluate a REPEAT instruction the expression is evaluated first, this
 * determines the number of times the instruction list is executed. This
 * instruction list is executed the appropriate number of times.
 * </p>
 * <p>
 * The value returned by evaluating a REPEAT instruction is the last value
 * returned by evaluating the instruction list.
 * </p>
 * 
 * @author Owen Astrachan
 */
public class Repeat extends Instruction {

	private ArithmeticBase repeatExpression;
	private StrictInstructionList instructionList;

	/**
	 * Constructs a Repeat instruction that can be executed.
	 * 
	 * @param e
	 *            number of times to repeat the body
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Repeat(ArithmeticBase e, StrictInstructionList sil) {
		repeatExpression = e;
		instructionList = sil;
	}

	/**
	 * Evaluate this instruction in a Context.
	 * 
	 * @param c
	 *            the Context for the evaluation
	 * @return the result of evaluating the instruction list the last time
	 */
	@Override
	public Object evaluate(Context c) {
		int count = (int) repeatExpression.value(c);
		Object result = null;
		for (int k = 0; k < count; k++) {
			result = instructionList.evaluate(c);
		}
		return result;
	}

	/**
	 * @return a String representing this instruction as REPEAT, followed by the
	 *         expression about how many times to repeat the instructions and
	 *         the list of instructions
	 */
	@Override
	public String toString() {
		return "REPEAT " + repeatExpression + instructionList;
	}
}
