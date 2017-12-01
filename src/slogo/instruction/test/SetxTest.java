/**
 * 
 */
package slogo.instruction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import slogo.turtle.JTurtle;

/**
 * @author amberly
 *
 */
public class SetxTest {
	
	JTurtle turtle = new JTurtle();

	@Test
	public void test() {
		turtle.myPoint.setLocation(50, 0);
		assertEquals(50, turtle.getPoint().getX(), 0.01);
	}

}
