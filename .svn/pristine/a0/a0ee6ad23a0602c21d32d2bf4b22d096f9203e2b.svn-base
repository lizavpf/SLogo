package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.*;

/**
 * @author Liza Freed
 *
 */
public class SetyParser implements Parser {

	public SetyParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a SETY command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat SETY token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Sety(e);
		
	}

}