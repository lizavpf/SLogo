package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * Parse a Clearscreen Statement, which looks like
 * 
 * Clearscreen
 * 
 * @author Kevin Havermann
 * 
 */
public class ClearscreenParser implements Parser {
	public ClearscreenParser() {

	}

	/**
	 * Parses a Clearscreen instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); 
 
		return new Clearscreen(); // eat CLEARSCREEN token
	}
}
