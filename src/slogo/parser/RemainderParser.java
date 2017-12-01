/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Remainder;

/**
 * @author Keith Denning
 *
 */
public class RemainderParser implements Parser {

	public RemainderParser() {
	}

	
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a REMAINDER command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat REMAINDER token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Remainder(e, f);
	}

}
