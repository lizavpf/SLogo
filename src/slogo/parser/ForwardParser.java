/**
 * 
 */
package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * @author Keith Denning
 *
 */
public class ForwardParser implements Parser {

	public ForwardParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a FORWARD command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat FORWARD token
		GrammarElement e = instructionParser.parse(interpreter);
		return new Forward(e);
		
	}

}
