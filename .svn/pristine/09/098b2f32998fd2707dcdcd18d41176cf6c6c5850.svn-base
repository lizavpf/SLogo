package slogo;

import java.util.*;

/**
 * All elements of the SLogo language (e.g., that make up an abstract syntax
 * tree) should extend GrammarElement. Evaluating a language construct with a
 * context returns the value of the evaluation and may have side-effects.
 * 
 * @author Owen Astrachan
 */
public abstract class GrammarElement {
	/**
	 * Evaluate this language construct in some context. The evaluation may have
	 * side-effects, e.g., moving a turtle.
	 * 
	 * @param c
	 *            context in which the evaluation takes place
	 * @return the result of evaluating the construct
	 */
	public abstract Object evaluate(Context c);

	static protected Map<GrammarElement, Object> gelementsToValue = new TreeMap<GrammarElement, Object>();
}
