/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;

/**
 * @author Emily Cohen
 *
 */
public class Right extends Instruction {

	private GrammarElement expression;

	/**
	 * Constructs a right instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Right(GrammarElement e) {
		expression = e;
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

		Double val = (Double) expression.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		double currentHeading = turtle.getHeading();
		double angle = Math.toRadians(val);
		double newAngle = angle + currentHeading;

		turtle.setHeading(newAngle);

		return expression;
	}

	/**
	 * @return Right followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "RIGHT " + expression;
	}

}
