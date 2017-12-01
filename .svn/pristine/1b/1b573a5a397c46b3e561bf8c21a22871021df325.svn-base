package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author Kevin Havermann
 *
 */
public class Ycor extends Instruction {
	/**
	 * Constructs an ycor instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Ycor() {
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
		double ycor = turtle.getPoint().getY();
		
		return ycor;
		
	}
	
	/**
	 * @return ycor 
	 */
	@Override
	public String toString() {
		return "YCOR";
	}

}