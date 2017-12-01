package slogo.parser;

import slogo.*;
import slogo.expression.*;
import slogo.instruction.*;

/**
 * Parse a REPEAT Statement, which looks like
 * 
 * REPEAT numOrVar [ instructionlist ]
 * 
 * @author Owen Astrachan
 * 
 */
public class RepeatParser implements Parser {
	public RepeatParser() {

	}

	/**
	 * Parses a REPEAT instruction
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter interpreter) {
		InstructionParser instructionParser = InstructionParser.getInstance();
		StrictInstructionListParser silParser = StrictInstructionListParser
				.getInstance();

		// already know this is a REPEAT command because InstructionParser
		// called this parse method.
		interpreter.nextToken(); // eat REPEAT

		ArithmeticBase e = (ArithmeticBase) instructionParser.parse(interpreter); // num or variable
		StrictInstructionList sil = (StrictInstructionList) silParser.parse(interpreter);
		return new Repeat(e, sil);
	}
}
