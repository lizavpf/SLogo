package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;

/**
 * @author Liza Freed
 *
 */

public class Sety extends Instruction {

	private GrammarElement expression;

	/**
	 * Constructs a sety instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */

	public Sety(GrammarElement e) {
		expression = e;
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
		Double val = (Double) expression.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		turtle.myNextPoint.setLocation(turtle.getPoint().getX(), val.intValue());
		turtle.myPoint.setLocation(turtle.myNextPoint.getX(), turtle.myNextPoint.getY());
		turtle.notifyListeners();
		return expression;
	}

	/**
	 * @return sety followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "SETY " + expression;
	}

}