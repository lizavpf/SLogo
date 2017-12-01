package slogo.instruction.test;

import static org.junit.Assert.*;

import java.awt.geom.Point2D;

import org.junit.Test;

import slogo.turtle.JTurtle;

public class HomeTest {
	
	JTurtle turtle = new JTurtle();

	@Test
	public void testHome() {
		turtle.reset();
		Point2D origin = new Point2D.Double(0, 0);
		assertEquals(origin, turtle.getPoint());
	}

}
