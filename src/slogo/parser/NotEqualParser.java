package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.NotEqual;

public class NotEqualParser implements Parser {

	public NotEqualParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a NOTEQUAL command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat NOTEQUAL token
		
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new NotEqual(e, f);
	}

}
