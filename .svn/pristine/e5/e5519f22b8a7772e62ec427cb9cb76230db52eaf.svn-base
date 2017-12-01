/**
 * 
 */
package slogo.parser;

import slogo.*;
import slogo.instruction.*;

/**
 * @author Emily Cohen
 *
 */
public class HeadingParser implements Parser{
	
	public HeadingParser() {
	}

	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat HEADING token
		
		return new Heading();
		
	}


}
