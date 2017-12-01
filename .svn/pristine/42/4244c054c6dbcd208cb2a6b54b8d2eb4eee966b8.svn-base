/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.Product;

/**
 * @author Keith Denning
 *
 */
public class ProductParser implements Parser {

	public ProductParser() {
	}


	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		
		// already know this is a PRODUCT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat PRODUCT token
		GrammarElement e = instructionParser.parse(interpreter);
		GrammarElement f = instructionParser.parse(interpreter);
		return new Product(e, f);
	}

}
