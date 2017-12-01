/**
 * 
 */
package slogo.parser;

import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.HideTurtle;

/**
 * @author Emily Cohen
 *
 */
public class HideTurtleParser implements Parser{
	public HideTurtleParser(){
		
	}

	/**
	 * Parses HIDETURTLE instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {

		interpreter.nextToken(); // eat HIDETURTLE token
 
		return new HideTurtle();
	}

}
