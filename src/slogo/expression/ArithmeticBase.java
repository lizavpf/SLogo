/**
 * 
 */
package slogo.expression;

import slogo.Context;
import slogo.GrammarElement;

/**
 * The "base" or factor of arithmetic instructions (a number or a variable)
 *
 */
public abstract class ArithmeticBase extends GrammarElement {

	/*
	 * (non-Javadoc)
	 * 
	 * @see slogo.GrammarElement#evaluate(slogo.Context)
	 */
	@Override
	public Double evaluate(Context c) {
		return value(c);
	}

	public abstract double value(Context c);

}
