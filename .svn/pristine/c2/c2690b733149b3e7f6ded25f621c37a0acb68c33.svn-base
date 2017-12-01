package slogo.parser;

import slogo.*;
import slogo.expression.VariableFactory;
import slogo.instruction.Assignment;
import slogo.parser.token.*;

/**
 * Parse an assignment statement, which looks like
 * 
 * &lt;id&gt; &lt;assignment_token, i.e., = &gt; &lt;expression&gt;
 * 
 * @author Owen Astrachan
 * 
 */
public class AssignmentParser implements Parser {
	public AssignmentParser() {

	}

	/**
	 * parses an assignment statement, which looks like
	 * 
	 * id = expression
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instParser = InstructionParser.getInstance();

		IdentifierToken idt = (IdentifierToken) interpreter.getToken();
		
		interpreter.nextToken();

		// if token doesn't match, an exception is thrown
		interpreter.match(CharTokenFactory.getToken(CharConsts.EQUAL));
		return new Assignment(VariableFactory.getVariable(idt), instParser.parse(interpreter));
	}
}
