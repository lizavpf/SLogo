package slogo.instruction;

import slogo.*;
import slogo.expression.ArithmeticBase;

/**
 * Represents a + b, the addition of two expressions
 * 
 * @author Owen Astrachan
 */
public class Addition extends BinaryExpression {

	/**
	 * Represents an addition
	 * 
	 * @param lhs the left-hand side of the addition (before the +)
	 * @param rhs the right-hand side of the addition (after the +) 
	 */
	public Addition(ArithmeticBase lhs, ArithmeticBase rhs) {
		super(lhs, rhs);
		mySymbol = "+";
	}

	@Override
	public double value(Context c) {
		return leftValue(c) + rightValue(c);
	}
}
