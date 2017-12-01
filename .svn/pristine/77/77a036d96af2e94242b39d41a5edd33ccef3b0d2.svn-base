package slogo.parser.token;

/**
 * Represents an identifier (a variable name)
 * 
 * @author Owen Astrachan
 * 
 */
public class IdentifierToken implements Token {
	private String id;

	public IdentifierToken() {
		this("DUMMY_ID");
	}

	public IdentifierToken(String value) {
		id = value;
	}

	/**
	 * Determines if the other object is an IdentifierToken with the same id
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof IdentifierToken)) {
			return false;
		}
		IdentifierToken idtoken = (IdentifierToken) o;
		return equals(idtoken);
	}

	public boolean equals(IdentifierToken idtoken) {
		return id.equals(idtoken.id);
	}

	public String value() {
		return id;
	}

	/**
	 * @return the id
	 */
	@Override
	public String toString() {
		return id;
	}

}
