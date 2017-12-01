package slogo.instruction;

import slogo.*;

/**
 * Represents unary minus, e.g., MINUS num OR -expression
 * 
 * @author Owen Astrachan
 */
public class Negation extends UnaryExpression {

	/**
	 * Represents a negation
	 * 
	 * @param e
	 *            the expression to negate
	 */
	public Negation(ArithmeticInstruction e) {
		super(e);
	}

	@Override
	public double value(Context c) {
		return -1 * super.value(c);
	}

	/**
	 * Format -expression
	 */
	@Override
	public String toString() {
		return "-" + super.toString();
	}
}
