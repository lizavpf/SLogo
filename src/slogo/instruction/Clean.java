package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;


/**
 * @author Kevin Havermann
 *
 */
public class Clean extends Instruction {
	/**
	 * Constructs a clean instruction that can be executed
	 *
	 *
	 */
	public Clean() {
	}

	/**
	 * Evaluate this instruction in a Context.
	 * 
	 * @param c
	 *            the Context for the evaluation
	 * @return 
	 */
	@Override
	public Object evaluate(Context c) {
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		turtle.clearLines();
		return null;
	}
	
	/**
	 * @return clean 
	 */
	@Override
	public String toString() {
		return "CLEAN";
	}

}