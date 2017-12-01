package slogo.instruction;

import slogo.*;
import slogo.expression.ArithmeticBase;

/**
 * Represents a / b, the division of two expressions
 * 
 * @author Owen Astrachan
 */
public class Division extends BinaryExpression {
	/**
	 * Represents a division
	 * 
	 * @param lhs
	 *            the left-hand side of the division (before the /)
	 * @param rhs
	 *            the right-hand side of the division (after the /)
	 */
	public Division(ArithmeticBase lhs, ArithmeticBase rhs) {
		super(lhs, rhs);
		mySymbol = "/";
	}

	@Override
	public double value(Context c) {
		return leftValue(c) / rightValue(c);
	}
}
