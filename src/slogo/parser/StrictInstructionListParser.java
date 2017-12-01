package slogo.parser;

import slogo.CharConsts;
import slogo.GrammarElement;
import slogo.SLogoInterpreter;
import slogo.instruction.*;
import slogo.parser.token.*;

/**
 * The parser for lists of instructions.
 * 
 * @author Owen Astrachan
 * 
 */
public class StrictInstructionListParser implements Parser {
	public static StrictInstructionListParser ourInstance = null;

	public static StrictInstructionListParser getInstance() {
		if (ourInstance == null) {
			ourInstance = new StrictInstructionListParser();
		}
		return ourInstance;
	}

	private StrictInstructionListParser() {

	}

	/**
	 * Parses the instructions list
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser ip = InstructionParser.getInstance();
		StrictInstructionList sil = new StrictInstructionList();
		Token t = interpreter.match(CharTokenFactory.getToken(CharConsts.LEFT_BRACKET));
		while (t != CharTokenFactory.getToken(CharConsts.RIGHT_BRACKET)) {
			sil.add((Instruction) ip.parse(interpreter));
			t = interpreter.getToken();
		}
		t = interpreter.match(CharTokenFactory.getToken(CharConsts.RIGHT_BRACKET));
		return sil;
	}
}
