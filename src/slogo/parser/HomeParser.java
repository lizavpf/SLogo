package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * Parse a HOME Statement, which looks like
 * 
 * HOME
 * 
 * @author Kevin Havermann
 * 
 */
public class HomeParser implements Parser {
	public HomeParser() {

	}

	/**
	 * Parses a Home instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat HOME token
 
		return new Home();
	}
}
