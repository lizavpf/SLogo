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
public class PenUp extends Instruction {

	/**
	 * Constructs a pen up instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public PenUp() {
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
		turtle.penUp();
		return "Pen is up";
	}

	/**
	 * @return pen up followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "PENUP";
	}

}
