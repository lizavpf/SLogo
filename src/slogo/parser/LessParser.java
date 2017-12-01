/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Less;

/**
 * @author Keith Denning
 *
 */
public class LessParser implements Parser {

	public LessParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();

		// already know this is a LESS command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat LESS token
		
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Less(e, f);
	}

}
