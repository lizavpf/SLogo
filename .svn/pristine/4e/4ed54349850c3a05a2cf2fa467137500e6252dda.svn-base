package slogo.instruction;


import slogo.Context;
import slogo.turtle.JTurtle;

public class HideTurtle extends Instruction{

	/**
	 * Constructs a HideTurtle instruction that can be executed
	 *
	 * @param sil
	 *            strict instruction list that is the body
	 */

	public HideTurtle() {
		
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
		
		boolean showing = turtle.turtleShowing();
		if (showing == true){
			turtle.hideTurtle();
		}
		turtle.move(0);
		return turtle.turtleShowing();
	}
	
	/**
	 * @return Hide Turtle 
	 */
	@Override
	public String toString() {
		return "HIDE TURTLE";
	}
}

