package slogo.instruction;

import slogo.*;

/**
 * Represents an instruction in the SLogo language
 * 
 * @author Owen Astrachan
 */
public abstract class Instruction extends GrammarElement {

	@Override
	public abstract Object evaluate(Context c);
}
