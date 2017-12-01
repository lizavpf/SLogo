/**
 * 
 */
package slogo.instruction;

import slogo.*;
import slogo.turtle.TurtleContext;

/**
 * @author Emily
 *
 */
public class To extends Instruction{
	private String subr_name;
	private StrictInstructionList instructionList;
	
	/**
	 * Constructs a To instruction that can be executed.
	 * 
	 * @param e
	 * 				grammar element
	 * 
	 * @param sil
	 * 				strict instruction list that is the body
	 */
	public To(String e , StrictInstructionList sil) {
		subr_name = e;
		instructionList = sil;
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
		c.addToMap(subr_name, instructionList);
		
		return null;
	}
	
	@Override
	public String toString() {
		return "TO " + subr_name;
	}
	
}
