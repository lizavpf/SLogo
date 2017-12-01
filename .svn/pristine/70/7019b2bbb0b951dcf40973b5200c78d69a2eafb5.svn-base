/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Minus;

/**
 * @author Keith Denning
 *
 */
public class MinusParser implements Parser {

	public MinusParser() {
	}


	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a MINUS command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat MINUS token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Minus(e);
	}

}
