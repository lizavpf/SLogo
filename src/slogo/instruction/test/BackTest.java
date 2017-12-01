package slogo.instruction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import slogo.turtle.JTurtle;

public class BackTest {

	JTurtle turtle = new JTurtle();
	@Test
	public void test() {
		turtle.move(-50);
		assertEquals(-50, turtle.getPoint().getY(), 0.01);
		assertEquals(0, turtle.getPoint().getX(), 0.01);
	}

}
