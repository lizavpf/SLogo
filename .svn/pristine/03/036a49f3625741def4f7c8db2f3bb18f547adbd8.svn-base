/**
 * 
 */
package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * @author Liza Freed
 *
 */
public class BackParser implements Parser {

	public BackParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a BACK command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat FORWARD token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Back(e);
		
	}

}