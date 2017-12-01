package slogo.parser;

/**
 * A specialized exception class for parsing errors.
 * 
 * @author Owen Astrchan
 * 
 */
@SuppressWarnings("serial")
public class ParseException extends RuntimeException {

	private String description;

	/**
	 * 
	 * @param desc
	 */
	public ParseException(String desc) {
		description = desc;
	}

	/**
	 * @return ParseException description
	 */
	@Override
	public String toString() {
		return "ParseException " + description;
	}

}
