package slogo.instruction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import slogo.turtle.JTurtle;

/**
 * 
 * @author amberly
 *
 */
public class PenDownTest {
	
	JTurtle turtle = new JTurtle();

	@Test
	public void testPenDown() {
		turtle.penDown();
		assertEquals(true, turtle.isPenDown());
	}

}
