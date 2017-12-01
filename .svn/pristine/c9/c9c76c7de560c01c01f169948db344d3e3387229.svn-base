package slogo.instruction;

import java.awt.geom.Point2D;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;

/**
 * @author Liza Freed
 *
 */

public class Setxy extends Instruction {

	private GrammarElement expression1;
	private GrammarElement expression2;
	Point2D newPoint;

	/**
	 * Constructs a setxy instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */

	public Setxy(GrammarElement e, GrammarElement f) {
		expression1 = e;
		expression2 = f;
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
		Double xVal = (Double) expression1.evaluate(c);
		Double yVal = (Double) expression2.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		System.out.println("x value" + xVal.intValue());
		System.out.println("y value" + yVal.intValue());
		turtle.myNextPoint.setLocation(xVal.intValue(), yVal.intValue());
		newPoint.setLocation(xVal.intValue(), yVal.intValue());
		turtle.myPoint.setLocation(turtle.myNextPoint.getX(), turtle.myNextPoint.getY());
		turtle.notifyListeners();
		return newPoint;
	}

	/**
	 * @return setxy followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "SETXY " + newPoint;
	}

}