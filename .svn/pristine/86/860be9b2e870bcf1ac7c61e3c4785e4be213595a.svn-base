package slogo.parser.token;

/**
 * Represents a variable
 * 
 * @author Owen Astrachan
 * 
 */
public class VariableToken implements Token {
	private String myValue;

	public VariableToken(String value) {
		myValue = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof VariableToken)) {
			return false;
		}
		VariableToken vtoken = (VariableToken) o;
		return equals(vtoken);
	}

	private boolean equals(VariableToken vt) {
		return myValue.equals(vt.myValue);
	}

	public String value() {
		return myValue;
	}

	@Override
	public String toString() {
		return myValue;
	}

}
