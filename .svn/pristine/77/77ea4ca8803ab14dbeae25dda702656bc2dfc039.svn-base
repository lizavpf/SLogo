/**
 * 
 */
package slogo.turtle;

import java.util.*;

import slogo.Context;

/**
 * @author Liza
 *
 */
public class TurtleContext implements Context{
	private Map<String, Object> turtleContextMap = new HashMap<String, Object>();
	
	JTurtle turtle;
	/**
	 * 
	 */
	public TurtleContext(JTurtle turtle) {
		// TODO Auto-generated constructor stub
		this.turtle = turtle;
		turtleContextMap.put("Leonardo", turtle);
	}

	@Override
	public Object value(String name) {
		// TODO Auto-generated method stub
		return turtleContextMap.get(name);
	}
	
	public void addToMap(String name, Object instructions) {
		turtleContextMap.put(name, instructions);
	}
	

}
