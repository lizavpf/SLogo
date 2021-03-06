package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * Parse a Ycor Statement, which looks like
 * 
 * YCOR
 * 
 * @author Kevin Havermann
 * 
 */
public class YcorParser implements Parser {
	public YcorParser() {

	}

	/**
	 * Parses a Ycor instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat YCOR token
 
		return new Ycor();
	}
}