package slogo.parser;

import slogo.*;
import slogo.instruction.*;

public class IFParser implements Parser {

	public IFParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		StrictInstructionListParser silParser = StrictInstructionListParser
				.getInstance();
		
		// already know this is a IF command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat IF token
		GrammarElement ge = instructionParser.parse(interpreter);
		StrictInstructionList sil = (StrictInstructionList) silParser.parse(interpreter);
		return new IF(ge, sil);
	}

}
