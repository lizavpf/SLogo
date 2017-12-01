package slogo.instruction;

import slogo.*;

/**
 * The base class of all arithmetic instruction, the {@link #evaluate evaluate}
 * method uses the hook/template method {@link #value value} to return a Double
 * value, the template method returns a double.
 * 
 * @author Owen Astrachan
 */
public abstract class ArithmeticInstruction extends Instruction {

	/**
	 * uses the hook/template method value to return a Double
	 * 
	 * @param c
	 *            the context of the expression--may affect the value
	 */
	public Double evaluate(Context c) {
		return value(c);
	}

	public abstract double value(Context c);
}
