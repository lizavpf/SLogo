/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author amberly wang
 *
 */
public class PenDownP extends Instruction {
	
	/**
	 * Constructs a pen down p instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public PenDownP() {
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
		if (turtle.isPenDown()){
		return "1 (:TRUE)";
		} else {
			return "0 (:FALSE)";
		}
	}
	
	/**
	 * @return pen down p followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "PENDOWNP";
	}

}
