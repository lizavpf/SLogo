package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * The parser for the print instruction
 * 
 * @author Owen Astrachan
 * 
 */
public class PrintParser implements Parser {
	public PrintParser() {

	}

	/**
	 * parses a print instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();

		// already know this is a PRINT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat PRINT token
		GrammarElement ge = instructionParser.parse(interpreter);
		return new Print(ge);
	}
}
