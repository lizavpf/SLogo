package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author Kevin Havermann
 *
 */
public class Home extends Instruction {
	/**
	 * Constructs a home instruction that can be executed
	 *
	 * 
	 */
	public Home() {
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
		currentHeading = 0;
		turtle.setHeading(currentHeading);
		turtle.reset();
		turtle.move(0);
		return "Turtle is home";
		
	}
	
	/**
	 * @return Home 
	 */
	@Override
	public String toString() {
		return "HOME";
	}

}
