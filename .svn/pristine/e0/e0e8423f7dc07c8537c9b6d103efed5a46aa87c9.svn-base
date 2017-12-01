package slogo.parser;

import slogo.*;
import slogo.instruction.*;

public class PenDownPParser implements Parser{

	public PenDownPParser () {
	}
	
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		
		interpreter.nextToken(); // eat PENDOWNP token
		return new PenDownP();
	}
}
