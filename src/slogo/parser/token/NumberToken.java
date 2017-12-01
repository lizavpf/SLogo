package slogo.parser.token;

/**
 * Represents a number (using doubles). Using equals, a NumberToken object
 * compares as true only to another NumberToken object with the same value
 * <p>
 * a NumberToken is immutable, once created it doesn't change
 * </p>
 * 
 * @author Owen Astrachan
 */
public class NumberToken implements Token {

	private double myValue;

	/**
	 * Constructs a token representing value
	 * 
	 * @param value
	 *            the value of this number token
	 */
	public NumberToken(double value) {
		myValue = value;
	}

	/**
	 * @return true iff o is a NumberToken with same value
	 */
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof NumberToken)) {
			return false;
		}
		NumberToken nToken = (NumberToken) o;
		return equals(nToken);
	}

	public boolean equals(NumberToken nt) {
		return myValue == nt.myValue;
	}

	/**
	 * @return the value of this token
	 */
	public double value() {
		return myValue;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return Double.toString(myValue);
	}

}
