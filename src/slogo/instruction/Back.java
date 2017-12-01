package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;

/**
 * @author Keith Denning
 *
 */

public class Back extends Instruction {

	private GrammarElement expression;

	/**
	 * Constructs a back instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 * @return 
	 */
	public Back(GrammarElement e) {
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
		/*
		int val = (int) expression.value(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		turtle.move(val);
		return expression;
		*/
		
		Double val = (Double) expression.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		turtle.move(-val.intValue());
		return expression;
	}
	
	/**
	 * @return bk followed by the expression and list of instructions
	 */
	@Override
	public String toString() {
		return "BACK " + expression;
	}

}
