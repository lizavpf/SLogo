package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;

/**
 * 
 * @author Keith Denning
 *
 */

public class NotEqual extends Instruction {

	private GrammarElement expression1;
	private GrammarElement expression2;

	/**
	 * Represents a not equal instruction that can be executed
	 * 
	 * @param e
	 *            the first element in the not equal
	 * @param f
	 *            the second element in the not equal
	 */
	public NotEqual(GrammarElement e, GrammarElement f) {
		expression1 = e;
		expression2 = f;
	}

	@Override
	public Object evaluate(Context c) {
		double val1 = (Double) expression1.evaluate(c);
		double val2 = (Double) expression2.evaluate(c);

		if (val1 != val2)
			return 1.0;
		else
			return 0.0;
	}

	/**
	 * @return not equal with the two expressions
	 */
	@Override
	public String toString() {
		return "NOTEQUAL?" + expression1 + " " + expression2;

	}

}
