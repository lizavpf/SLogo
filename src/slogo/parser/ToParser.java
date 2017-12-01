/**
 * 
 */
package slogo.parser;

import slogo.*;
import slogo.expression.VariableFactory;
import slogo.instruction.*;
import slogo.parser.token.*;
import slogo.instruction.Assignment;

/**
 * @author Emily
 *
 */
public class ToParser implements Parser{
	public ToParser() {
		
	}

	/**
	 * parses a to instruction
	 */
	
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		StrictInstructionListParser silParser = StrictInstructionListParser
				.getInstance();
		// already know this is a TO command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat TO token
		IdentifierToken ident = (IdentifierToken) interpreter.getToken();
		String name = ident.value();
		interpreter.nextToken();
		//GrammarElement e = instructionParser.parse(interpreter);
		StrictInstructionList sil = (StrictInstructionList) silParser.parse(interpreter);
		return new To(name, sil);
				//Assignment(VariableFactory.getVariable(ident), e);
	}
}
