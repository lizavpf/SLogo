package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;

/**
 * The Print instruction prints an expression. When evaluated, the Print
 * instruction evaluates the expression and prints the value to System.out using
 * println.
 * 
 * @author Owen Astrachan
 * 
 */
public class Print extends Instruction {

	private GrammarElement expression;

	/**
	 * Represents a Print expression
	 * 
	 * @param e
	 */
	public Print(GrammarElement e) {
		expression = e;
	}

	/**
	 * Evaluate the expression and println it.
	 * 
	 * @param c
	 *            is the Context in which the evaluation occurs
	 * @return the expression to print
	 */
	@Override
	public Object evaluate(Context c) {
		Object val = expression.evaluate(c);
		
		return val;
	}

	/**
	 * @return PRINT followed by the expression
	 */
	@Override
	public String toString() {
		return "PRINT " + expression;
	}

}
