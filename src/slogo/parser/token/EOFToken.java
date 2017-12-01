package slogo.parser.token;

/**
 * This represents an end-of-file token Uses the singleton pattern since there's
 * no reason to have more than one such token. For equals This compares false to
 * any object other than an EOFToken
 * 
 * @author Owen Astrachan
 */
public class EOFToken implements Token {

	private static EOFToken ourInstance;

	/**
	 * @return an EOFToken (singleton)
	 */
	public static EOFToken getInstance() {
		if (ourInstance == null) {
			ourInstance = new EOFToken();
		}
		return ourInstance;
	}

	private EOFToken() {

	}

	/**
	 * @return true of o is an EOFToken, otherwise return false
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof EOFToken)) {
			return false;
		}
		return true;
	}

	/**
	 * @return EOF_Token
	 */
	@Override
	public String toString() {
		return "EOF_Token";
	}
}
