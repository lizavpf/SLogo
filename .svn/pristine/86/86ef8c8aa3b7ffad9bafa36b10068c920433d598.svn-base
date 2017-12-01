package slogo.expression;

import slogo.*;
import slogo.turtle.TurtleContext;

/**
 * A variable stores a value and can be used in an expression. Clients can
 * create many objects representing a variable, say "X", but each of these maps
 * to the same object so that there is a common value for any occurrence of a
 * named-variable
 * 
 * @see VariableFactory
 * @author Owen Astrachan
 */
public class Variable extends ArithmeticBase implements Comparable<Variable> {
	private String myName;

	/**
	 * Represents a variable
	 * 
	 * @param name
	 *            - the variable's name, e.g., "X"
	 */
	public Variable(String name) {
		myName = name;
	}

	public double value(Context c) {
		String name = this.toString();
		Double d = (Double) c.value(name);
		if (d == null)
			return 0;
		return d.doubleValue();
	}

	/**
	 * uses the hook/template method value to return a Double
	 * 
	 * @param c
	 *            the context of the expression--may affect the value
	 */
	public Double evaluate(Context c) {
		return value(c);
	}

	/**
	 * Determines equality based on the Variable's name
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Variable)) {
			return false;
		}
		Variable v = (Variable) o;
		return myName.equals(v.myName);
	}

	/**
	 * Compare the variables by their names.
	 */
	@Override
	public int compareTo(Variable v) {
		return myName.compareTo(v.myName);
	}

	/**
	 * @returns the variable's name
	 */
	@Override
	public String toString() {
		return myName;
	}

}
