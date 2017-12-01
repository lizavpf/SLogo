package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author Emily Cohen
 *
 */
public class ShowTurtle extends Instruction {

	/**
	 * Constructs a ShowTurtle instruction that can be executed
	 *
	 * @param sil
	 *            strict instruction list that is the body
	 */

	public ShowTurtle() {

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
		if (showing == false) {
			turtle.showTurtle();

		}
		turtle.move(0);
		return turtle.turtleShowing();
	}

	/**
	 * @return ShowTurtle
	 */
	@Override
	public String toString() {
		return "SHOWTURTLE";
	}
}
