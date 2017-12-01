/**
 * 
 */
package slogo.instruction;

import slogo.Context;
import slogo.GrammarElement;
import slogo.turtle.JTurtle;


/**
 * @author Emily Cohen
 *
 */
public class Towards extends Instruction {
	private GrammarElement expression1;
	private GrammarElement expression2;
	
	/**
	 * Constructs a towards instruction that can be executed
	 *
	 * @param e
	 *            grammar element
	 * @param sil
	 *            strict instruction list that is the body
	 */
	public Towards(GrammarElement e, GrammarElement f) {
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
		double xVal = (Double) expression1.evaluate(c);
		double yVal = (Double) expression2.evaluate(c);
		JTurtle turtle;
		turtle = (JTurtle) c.value("Leonardo");
		
		double newAngle = Math.atan(xVal/yVal);
		int angle = 0;
		if( yVal < 0){
			 angle = (int) (Math.toDegrees(newAngle) + 180);
		}
		else{ angle = (int) (Math.toDegrees(newAngle));
		}
		
		turtle.setHeading(angle);
		
		return angle;
	}
	
	/**
	 * @return Towards followed by the two expressions and list of instructions
	 */
	@Override
	public String toString() {
		return "Towards " + expression1 + " " + expression2;
	}


}
