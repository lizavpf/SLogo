package slogo.instruction;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import slogo.Context;

/**
 * A list of instructions that doesn't include a function definition. This is
 * the definition of <em>Strict</em>, an instruction list can include any
 * instruction, including a function definition, whereas a strict instruction
 * list doesn't include these.
 * <p>
 * Constructing a strict instruction list is usually accomplished by creating an
 * object and repeatedly calling <code>add</code> to add new instructions. The
 * order in which instructions are added is the order in which they'll be
 * executed.
 * </p>
 * 
 * @author Owen Astrachan
 */
public class StrictInstructionList extends Instruction {

	private List<Instruction> myInstructionList;

	/**
	 * Construct an empty list of instructions.
	 */
	public StrictInstructionList() {
		myInstructionList = new ArrayList<>();
	}

	/**
	 * Add an instruction to this list (FIFO order for execution).
	 * 
	 * @param instruction
	 *            the instruction added.
	 */
	public void add(Instruction instruction) {
		myInstructionList.add(instruction);
	}

	/**
	 * Evaluate this instruction in a Context, return the result of the
	 * evaluation (the result is the last instruction executed).
	 * 
	 * @param c
	 *            the context for the evaluation
	 * @return the result of evaluating the last expression in the list
	 */
	@Override
	public Object evaluate(Context c) {
		Object result = null;
		for (int k = 0; k < myInstructionList.size(); k++) {
			result = myInstructionList.get(k).evaluate(c);
		}
		return result;
	}

	/**
	 * Return an iterator for accessing all the instructions.
	 * 
	 * @return an iterator for accessing the instructions
	 */
	public Iterator<Instruction> iterator() {
		return myInstructionList.iterator();
	}

	/**
	 * Return a string indicating the # of instructions in the list
	 * 
	 * @return "[list of size = # instructions]"
	 */
	@Override
	public String toString() {
		return "[" + "list of size " + myInstructionList.size() + " ]";
	}

}
