/**
 * 
 */
package slogo.instruction;

import slogo.*;


/**
 * @author keith
 *
 */
public class IF extends Instruction {
	private GrammarElement statement;
	private StrictInstructionList instructionList;

	/**
	 * Constructs an IF instruction that can be executed.
	 * 
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public IF(GrammarElement e, StrictInstructionList sil) {
		statement = e;
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
		Object result = null;
		double val = (double) statement.evaluate(c);
		if (val != 0){
			result = instructionList.evaluate(c);
		}
		return result;
	}

	/**
	 * @return a String representing this instruction as IF, followed by the
	 *         expression about the condition and
	 *         the list of instructions
	 */
	@Override
	public String toString() {
		return "IF " + statement + instructionList;
	}
}
