package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Equal;

public class EqualParser implements Parser {

	public EqualParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a EQUAL command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat EQUAL token
		
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Equal(e, f);
	}

}
