package slogo.turtle;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;

/**
 * Renders the graphical representation of the turtle
 * 
 * @author Owen Astrachan
 *
 */
abstract class Renderer {
	abstract public void paint(Graphics2D g);
}

/**
 * Default renderer: draws as a triangle.
 *
 */
class PolyRenderer extends Renderer {
	private Polygon myShape;

	public PolyRenderer() {
		myShape = new Polygon();
		myShape.addPoint(-20, -20);
		myShape.addPoint(20, -20);
		myShape.addPoint(0, 20);
	}

	public void paint(Graphics2D g) {
		g.setColor(Color.black);
		g.draw(myShape);
		g.fill(myShape);
	}
}

/**
 * Displays the given image
 * 
 */
class ImageRenderer extends Renderer {
	private Image myImage;

	public ImageRenderer(Image img) {
		myImage = img;
	}

	public void paint(Graphics2D g) {
		g.drawImage(myImage, -myImage.getWidth(null)/2, -myImage.getHeight(null)/2, null);
	}
}
