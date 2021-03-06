package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;


/**
 * @author Kevin Havermann
 *
 */
public class Clearscreen extends Instruction {
	/**
	 * Constructs a clearscreen instruction that can be executed
	 *
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Clearscreen() {
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
		turtle.clearLines();
		turtle.reset();
		turtle.move(0);
		return null;
	}
	
	/**
	 * @return clearscreen 
	 */
	@Override
	public String toString() {
		return "CLEARSCREEN";
	}

}