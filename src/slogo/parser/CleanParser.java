package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * Parse a CLEAN Statement, which looks like
 * 
 * CLEAN
 * 
 * @author Kevin Havermann
 * 
 */
public class CleanParser implements Parser {
	public CleanParser() {

	}

	/**
	 * Parses a Clean instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat CLEAN token
 
		return new Clean();
	}
}