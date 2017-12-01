/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;

/**
 * @author Keith Denning
 *
 */
public class Forward extends Instruction {
	
	private GrammarElement expression;

	/**
	 * Constructs a forward instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Forward(GrammarElement e) {
		expression = e;
	}

	/**
	 * Evaluate this instruction in a Context.
	 * 
	 * @param c
	 *            the Context for the evaluation
	 * @return the result of evaluating the instruction list the last time
	 */
	@Override
	public Object evaluate(Context c) {		
		Double val = (Double) expression.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		turtle.move(val.intValue());
		return expression;
	}
	
	/**
	 * @return fd followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "FORWARD " + expression;
	}

}
