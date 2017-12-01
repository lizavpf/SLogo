package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.*;

/**
 * @author Liza Freed
 *
 */
public class SetxyParser implements Parser {

	public SetxyParser() {
	}

	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a SETXY command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat SETXY token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Setxy(e,f);
		
	}

}