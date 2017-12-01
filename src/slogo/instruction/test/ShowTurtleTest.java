package slogo.instruction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import slogo.turtle.JTurtle;
/**
 * 
 * @author amberly
 *
 */

public class ShowTurtleTest {

	JTurtle turtle = new JTurtle();
	
	@Test
	public void test() {
		turtle.showTurtle();
		assertEquals(true, turtle.turtleShowing());
	}

}
