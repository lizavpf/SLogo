package slogo.instruction;

import slogo.*;

/**
 * Represents a unary expression
 * 
 * @author Owen Astrachan
 * 
 */
public abstract class UnaryExpression extends ArithmeticInstruction {
	protected ArithmeticInstruction myExpression;

	/**
	 * Represents a unary expression
	 * 
	 * @param e
	 *            the expression
	 */
	public UnaryExpression(ArithmeticInstruction e) {
		myExpression = e;
	}

	@Override
	public double value(Context c) {
		return myExpression.evaluate(c);
	}

	@Override
	public String toString() {
		return myExpression.toString();
	}

}
