package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.*;

/**
 * @author Liza Freed
 *
 */
public class SetxParser implements Parser {

	public SetxParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a SETX command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat SETX token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Setx(e);
		
	}

}
