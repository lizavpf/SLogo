package slogo.parser.token;

/**
 * Represents a reserved word
 * 
 * @author Owen Astrachan
 * 
 */
public class ReservedToken implements Token {

	private String myReservedValue;

	public ReservedToken(String value) {
		myReservedValue = value;
	}

	/**
	 * Determines equality by if these are both ReservedTokens with the same
	 * value.
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ReservedToken)) {
			return false;
		}
		ReservedToken reservedToken = (ReservedToken) o;
		return myReservedValue.equals(reservedToken.myReservedValue);
	}

	public String value() {
		return myReservedValue;
	}

	@Override
	public String toString() {
		return myReservedValue;
	}

}
