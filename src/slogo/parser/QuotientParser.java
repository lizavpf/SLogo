/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Quotient;

/**
 * @author Keith Denning
 *
 */
public class QuotientParser implements Parser {

	public QuotientParser() {
	}

	
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a QUOTIENT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat QUOTIENT token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Quotient(e, f);
	}

}
