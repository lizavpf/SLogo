/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;

/**
 * @author Keith Denning
 *
 */
public class Minus extends Instruction {

	private GrammarElement expression;

	/**
	 * Represents a minus instruction that can be executed
	 * 
	 * @param e
	 *            the first element in the minus
	 * 
	 */

	public Minus(GrammarElement e) {
		expression = e;
	}

	/**
	 * Evaluate this instruction in a Context.
	 * 
	 * @param c
	 *            the Context for the evaluation
	 * 
	 * @return the result of evaluating the instruction list the last time
	 */
	@Override
	public Object evaluate(Context c) {
		double val = (Double) expression.evaluate(c);

		return -val;
	}

	/**
	 * @return minus with the expressions
	 */
	@Override
	public String toString() {
		return "MINUS " + expression;
	}
}
