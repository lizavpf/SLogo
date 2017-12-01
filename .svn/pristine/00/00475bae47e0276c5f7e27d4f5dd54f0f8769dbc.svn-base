package slogo;

/**
 * Context is a hook for implementing language features that require an
 * environment for evaluation. For example, in parsing SLogo you might need to
 * update a Turtle model, or use a Graphics object to display information. These
 * objects can be made accessible via the Context class so that an
 * {@link slogo.instruction.Instruction slogo.instruction.Instruction}
 * can execute and modify/access the Context as appropriate.
 * 
 * @author Owen Astrachan
 */
public interface Context {
	/**
	 * If there are local/global variables, a variable might have a different
	 * value depending on the Context, so Contexts should support determining
	 * the value of an identifier.
	 * 
	 * @param name
	 *            identifier being evaluated in this Context
	 * @return the object mapped to by the identifier in this Context
	 */
	Object value(String name);
	
	void addToMap(String name, Object instructions);
}
