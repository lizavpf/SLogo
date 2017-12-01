package slogo.instruction;

import slogo.Context;
import slogo.expression.ArithmeticBase;

/**
 * The base class of any binary expression, e.g., a + b, a - b, or, in future
 * use, a < b and so on. A binary expression has two subexpressions that can be
 * evaluated via the methods <code>leftValue</code> and <code>rightValue</code>
 * which, presumably, subclasses will call.
 * <p>
 * The current version is tied to arithmetic expressions via the the return type
 * of <code>leftValue</code> and <code>rightValue</code>.
 * </p>
 * 
 * @author Owen Astrachan
 */
public abstract class BinaryExpression extends ArithmeticInstruction {

	protected String mySymbol;
	protected ArithmeticBase myLeft;
	protected ArithmeticBase myRight;

	/**
	 * construct a binary expression from two subexpressions
	 * 
	 * @param lhs
	 *            is the left subexpression (left-hand side)
	 * @param rhs
	 *            is the right subexpression (right-hand side)
	 */
	public BinaryExpression(ArithmeticBase lhs, ArithmeticBase rhs) {
		myLeft = lhs;
		myRight = rhs;
	}

	/**
	 * @return the result of evaluating the left subexpression
	 */
	public double leftValue(Context c) {
		return myLeft.evaluate(c);
	}

	/**
	 * @return the result of evaluating the right subexpression
	 */
	public double rightValue(Context c) {
		return myRight.evaluate(c);
	}

	/**
	 * Combine left/right subexpressions, return result using symbol as the
	 * combiner/juxtaposer for the subexpressions.
	 * 
	 * @return a string representing this expression
	 */
	public String toString() {
		return myLeft.toString() + " " + mySymbol + " " + myRight.toString();
	}

}
