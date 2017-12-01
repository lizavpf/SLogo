package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * @author Emily Cohen
 *
 */


public class RightParser implements Parser{
	
	public RightParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a RIGHT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat RIGHT token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Right(e);
		
	}


}
