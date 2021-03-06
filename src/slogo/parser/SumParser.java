/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Sum;

/**
 * @author Keith Denning
 *
 */
public class SumParser implements Parser {

	public SumParser() {
	}

	/* (non-Javadoc)
	 * @see slogo.parser.Parser#parse(slogo.SLogoInterpreter)
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a SUM command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat SUM token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Sum(e, f);
	}

}
