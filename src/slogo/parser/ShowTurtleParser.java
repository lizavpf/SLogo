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
public class ShowTurtleParser implements Parser{
	public ShowTurtleParser(){
		
	}

	/**
	 * Parses Show Turtle instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat SHOWTURTLE token
 
		return new ShowTurtle();
	}
	
}
