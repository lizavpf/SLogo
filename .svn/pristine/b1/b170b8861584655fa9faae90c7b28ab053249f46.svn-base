package slogo.parser.token;

/**
 * This represents an end-of-line token. Uses the singleton pattern since there's
 * no reason to have more than one such token. For equals, this compares false
 * to any object other than an EOLToken
 * 
 * @author Owen Astrachan
 */
public class EOLToken implements Token {

	private static EOLToken ourInstance;

	/**
	 * @return an EOLToken (singleton)
	 */
	public static EOLToken getInstance() {
		if (ourInstance == null) {
			ourInstance = new EOLToken();
		}
		return ourInstance;
	}

	private EOLToken() {

	}

	/**
	 * @return true of o is an EOLToken; otherwise, return false
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof EOLToken)) {
			return false;
		}
		return true;
	}

	/**
	 * @return EOL_Token
	 */
	@Override
	public String toString() {
		return "EOL_Token";
	}

}
