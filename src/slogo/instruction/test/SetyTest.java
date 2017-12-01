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
public class SetyTest {
	
	JTurtle turtle = new JTurtle();

	@Test
	public void test() {
		turtle.myPoint.setLocation(0, 50);
		assertEquals(50, turtle.getPoint().getY(), 0.01);
	}

}
