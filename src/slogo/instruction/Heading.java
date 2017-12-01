/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author Emily Cohen
 *
 */
public class Heading extends Instruction {

	
	/**
	 * Constructs a heading instruction that can be executed
	 *
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Heading() {
		
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
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		double currentHeading = turtle.getHeading();
		int angle = (int) Math.round(Math.toDegrees(currentHeading));
		
		return angle;
	}
	
	/**
	 * @return Heading followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "HEADING ";
	}

}
