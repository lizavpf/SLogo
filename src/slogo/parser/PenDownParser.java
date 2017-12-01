package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * 
 * @author amberly wang
 *
 */

public class PenDownParser implements Parser {
	
	public PenDownParser() {
	}
	
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		
		interpreter.nextToken(); // eat PENDOWN token
		return new PenDown();
		
	}
}
