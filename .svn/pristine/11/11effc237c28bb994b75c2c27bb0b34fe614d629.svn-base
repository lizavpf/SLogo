package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * @author Kevin Havermann
 *
 */

public class LeftParser implements Parser {

	public LeftParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();

		// already know this is a LEFT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat LEFT token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Left(e);

	}

}
