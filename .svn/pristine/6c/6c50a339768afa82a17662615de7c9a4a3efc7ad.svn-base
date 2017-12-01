package slogo.expression;

import java.util.*;

import slogo.parser.token.*;

/**
 * Clients can use this class to obtain a unique variable per identifier
 * (avoiding a proliferation of objects)
 * 
 * @author Owen Astrachan
 */
public class VariableFactory {

	private static VariableFactory ourInstance;
	private static Map<String, Variable> varnameToVariable = new HashMap<>(1001);

	/**
	 * There should only be one VariableFactory
	 * 
	 * @return the variable factory
	 */
	public static VariableFactory getInstance() {
		if (ourInstance == null) {
			ourInstance = new VariableFactory();
		}
		return ourInstance;
	}

	private VariableFactory() {

	}

	/**
	 * Determines the variable represented by the given id
	 * 
	 * @param idToken
	 *            - an identifier token
	 * @return the variable that maps to this id token
	 */
	public static Variable getVariable(IdentifierToken idToken) {
		String varName = idToken.value();
		Variable v = varnameToVariable.get(varName);
		if (v != null) {
			return v;
		} else {
			v = new Variable(varName);
			varnameToVariable.put(varName, v);
			return v;
		}
	}

}
