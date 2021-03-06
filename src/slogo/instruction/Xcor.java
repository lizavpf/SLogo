package slogo.instruction;

import slogo.Context;
import slogo.turtle.JTurtle;

/**
 * @author Kevin Havermann
 *
 */
public class Xcor extends Instruction {
	/**
	 * Constructs an xcor instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Xcor() {
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
		double xcor = turtle.getPoint().getX();

		return xcor;

	}

	/**
	 * @return xcor
	 */
	@Override
	public String toString() {
		return "XCOR";
	}

}
