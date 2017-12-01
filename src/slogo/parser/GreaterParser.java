package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Greater;

public class GreaterParser implements Parser {

	public GreaterParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a GREATER command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat GREATER token
		
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Greater(e, f);
	}

}
