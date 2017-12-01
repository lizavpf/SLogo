/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Difference;

/**
 * @author Keith Denning
 *
 */
public class DifferenceParser implements Parser {

	public DifferenceParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();

		// already know this is a DIFFERENCE command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat DIFFERENCE token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Difference(e, f);
	}

}
