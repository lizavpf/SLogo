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
public class Less extends Instruction {

	private GrammarElement expression1;
	private GrammarElement expression2;

	/**
	 * Represents a less instruction that can be executed
	 * 
	 * @param e
	 *            the first element in the less
	 * @param f
	 *            the second element in the less
	 * 
	 */
	public Less(GrammarElement e, GrammarElement f) {
		expression1 = e;
		expression2 = f;
	}

	/*
	 * Evaluate this instruction in a Context
	 * 
	 * @param c the Context for the evaluation
	 * 
	 * @return the result of evaluating the instruction list the last time
	 */
	@Override
	public Object evaluate(Context c) {
		double val1 = (Double) expression1.evaluate(c);
		double val2 = (Double) expression2.evaluate(c);

		if (val1 < val2)
			return 1.0;
		else
			return 0.0;
	}

	/**
	 * @return the difference with the two expressions
	 */
	@Override
	public String toString() {
		return "LESS? " + expression1 + " " + expression2;
	}

}
