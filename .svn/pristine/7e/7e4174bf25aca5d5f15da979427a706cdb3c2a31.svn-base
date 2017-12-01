package slogo.parser.token;

/**
 * A token represented by a single character, e.g., <tt>'*', ';', '['</tt> and
 * so on; the method equals compares a CharToken as equal to another CharToken
 * encapsulating the same character.
 * <p>
 * Client code should use CharTokenFactory to get a CharToken object, the
 * constructor is package access only
 * </p>
 * 
 * @author Owen Astrachan
 */
public class CharToken implements Token {

	private int myValue;

	/**
	 * package only constructor
	 */
	protected CharToken(int ch) {
		myValue = ch;
	}

	/**
	 * @return true iff o is a CharToken with same value
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof CharToken)) {
			return false;
		}
		CharToken rhs = (CharToken) o;
		return equals(rhs);
	}

	private boolean equals(CharToken ct) {
		return myValue == ct.myValue;
	}

	/**
	 * @return the encapsulated value
	 */
	public int value() {
		return myValue;
	}

	/**
	 * @return the character
	 */
	@Override
	public String toString() {
		return Character.toString((char) myValue);
	}
}
