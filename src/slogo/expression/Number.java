package slogo.expression;

import slogo.Context;

/**
 * Represents a number
 * 
 * @author Owen Astrachan
 * 
 */
public class Number extends ArithmeticBase {
	protected double myValue;

	/**
	 * Represents a number
	 * 
	 * @param d
	 *            the number
	 */
	public Number(double d) {
		myValue = d;
	}

	@Override
	public double value(Context c) {
		return myValue;
	}

	@Override
	public String toString() {
		return "" + myValue;
	}
}
