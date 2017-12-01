/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Towards;

/**
 * @author Emily Cohen
 *
 */
public class TowardsParser implements Parser{
	
	public TowardsParser() {
		
	}
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a TOWARDS command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat TOWARDS token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Towards(e, f);
	}
	

}
