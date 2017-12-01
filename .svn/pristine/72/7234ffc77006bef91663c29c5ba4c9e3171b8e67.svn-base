package slogo.instruction;

import slogo.Context;
import slogo.expression.ArithmeticBase;

/**
 * Represents a x b, the multiplication of two expressions
 * 
 * @author Owen Astrachan
 */
public class Multiplication extends BinaryExpression {

	/**
	 * Represents a multiplication
	 * 
	 * @param lhs
	 *            the left-hand side of the multiplication (before the x)
	 * @param rhs
	 *            the right-hand side of the multiplication (after the x)
	 */
	public Multiplication(ArithmeticBase lhs, ArithmeticBase rhs) {
		super(lhs, rhs);
		mySymbol = "*";
	}

	@Override
	public double value(Context c) {
		return leftValue(c) * rightValue(c);
	}
}
