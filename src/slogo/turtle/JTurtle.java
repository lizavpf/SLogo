package slogo.turtle;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import slogo.turtle.TurtleLine;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import junit.framework.Test;

/**
 * This class is a simple MoboLogo/Slogo turtle model for illustrating
 * rudimentary MVC for turtles and simple Graphics2D concepts
 * 
 * @author Owen Astrachan
 */
public class JTurtle {

	Renderer newRenderer;
	
	/**
	 * Create a turtle using the default (triangle) image.
	 */
	public JTurtle() {
		this(new PolyRenderer());
	}

	/**
	 * Creates a turtle using the given image
	 * 
	 * @param img
	 *            the image to use for the turtle
	 */
	public JTurtle(Image img) {
		this(new ImageRenderer(img));	
	}

	private JTurtle(Renderer renderer) {
		reset();
		myRenderer = renderer;
		myListeners = new ArrayList<>();
		try{
			URL url = new URL(
		            "http://static1.grsites.com/archive/sounds/water/water018.wav");
		        clip = AudioSystem.getClip();
		        // getAudioInputStream() also accepts a File or InputStream
		        ais = AudioSystem.getAudioInputStream( url );
		        clip.open(ais);
		        clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception ex)
			{
				System.out.println("Error");
			}
		
	}

	/**
	 * Mirrors the functionality of JComponent/Component. The current turtle
	 * isn't a Component, but it sort of acts like one (it's drawable).
	 * 
	 * @see java.awt.Component#getBounds
	 */
	public Rectangle getBounds(Rectangle r) {
		r.height = HEIGHT;
		r.width = WIDTH;
		return r;
	}

	/**
	 * Reposition turtle at the origin, facing north.
	 */
	public void reset() {
		myHeading = 0.0;
		myPoint = new Point2D.Double(0, 0);
		myNextPoint = new Point2D.Double(0, 0);
	}

	/**
	 * Draw the turtle if showing, pass in a Graphics2D object.
	 * 
	 * @param g
	 *            is the graphics context in which Turtle is drawn
	 */
	public void draw(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		if (turtleShowing() == true) {
			// translate relative to center of screen with y increasing
			g2.translate(START_X + myPoint.getX(), START_Y - myPoint.getY());
			// rotate so turtle drawn in right orientation
			g2.rotate(trueHeading());

			myRenderer.paint(g2);

			// undo transformations to leave graphics in same state as before
			g2.rotate(-trueHeading());
			g2.translate(-(START_X + myPoint.getX()), -(START_Y - myPoint.getY()));
		}
		for (TurtleLine line : lines) {
			g2.setColor(line.getLineColor());
			g2.setStroke(new BasicStroke(line.getLineWidth()));
			g2.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2());
		}
	}

	public void changeRenderer(Image img) {
		myRenderer = new ImageRenderer(img);
		notifyListeners();
	}

	
	public void hideTurtle() {

		showing = false;
	}

	public void showTurtle() {

		showing = true;
	}

	public boolean turtleShowing() {
		return showing;
	}

	/**
	 * Return the real/true heading of the turtle. A Turtle's "heading" is what
	 * naive users would expect, i.e., 0 degrees == north, 90 degrees = east,
	 * -90 degrees = west. The trueheading translates to what Graphics/geometry
	 * expects
	 * 
	 * @return the true heading in radians
	 */
	protected double trueHeading() {
		return Math.PI + myHeading;
	}

	/**
	 * Moves the turtle forward. If the pen is down draw lines
	 * 
	 * @param steps
	 *            is the number of steps moved
	 */
	public void move(int steps) {
		double deltaX = Math.sin(getHeading()) * steps;
		double deltaY = Math.cos(getHeading()) * steps;

		myNextPoint.setLocation(myPoint.getX() + deltaX, myPoint.getY() + deltaY);

		if (isPenDown()) {
			int x1 = (int) (START_X + myPoint.getX());
			int y1 = (int) (START_Y - myPoint.getY());
			int x2 = (int) (START_X + myNextPoint.getX());
			int y2 = (int) (START_Y - myNextPoint.getY());

			TurtleLine line = new TurtleLine(x1, y1, x2, y2, getPenWidth(), getPenColor());

			lines.add(line);
		}

		myPoint.setLocation(myNextPoint.getX(), myNextPoint.getY());

		notifyListeners();
		clip.stop();
		
	}

	/**
	 * Enables the turtle to draw lines
	 */
	public void penDown() {
		penDown = true;
	}

	/**
	 * Disables the turtle to draw lines
	 */
	public void penUp() {
		penDown = false;
	}

	public boolean isPenDown() {
		return penDown;
	}

	public void setPenColor(Color c) {
		color = c;
	}

	public Color getPenColor() {
		return color;
	}

	public void setPenWidth(float w) {
		penWidth = w;
	}

	public float getPenWidth() {
		return penWidth;
	}

	/**
	 * Set heading in degrees, notify listeners.
	 * 
	 * @param degrees
	 *            will be Turtle's new heading
	 */
	public void setHeading(int degrees) {
		setHeading(Math.toRadians(degrees));
	}

	/**
	 * Set heading in radians, notify listeners.
	 * 
	 * @param radians
	 *            Turtle's new heading
	 */
	public void setHeading(double radians) {
		myHeading = radians;
		notifyListeners();
	}

	/**
	 * Returns the naive view of heading, 0 degrees = north
	 * 
	 * @return the heading
	 */
	public double getHeading() {
		return myHeading;
	}

	/**
	 * Returns the turtle's point (should be centroid)
	 * 
	 * @return the center point
	 */
	public Point2D getPoint() {
		return myPoint;
	}

	/**
	 * Ask all registered listeners to process this turtle
	 */
	public void notifyListeners() {
		for (TurtleListener listener : myListeners) {
			listener.processTurtle(this);
		}
	}

	/**
	 * Add a listener.
	 * 
	 * @param listener
	 *            is the listener added
	 */
	public void addTurtleListener(TurtleListener listener) {
		myListeners.add(listener);
	}

	/**
	 * Sets the turtles point, notifies listeners.
	 * 
	 * @param p
	 *            is the new center point
	 */
	public void setPoint(Point2D p) {
		myPoint = p;
		notifyListeners();
	}

	/**
	 * Clears the turtles lines, notifies listeners.
	 * 
	 * 
	 */
	public void clearLines() {
		lines.clear();
		notifyListeners();
	}
	
	public void soundOn() {
		soundOn = true;
	}
	
	public void soundOff() {
		soundOn = false;
	}

	double myHeading;
	public Point2D myPoint;
	public Point2D myNextPoint;
	Renderer myRenderer;
	private boolean penDown = true;
	public ArrayList<TurtleLine> lines = new ArrayList<TurtleLine>();
	public Color color = Color.black;
	public float penWidth;
	private boolean showing = true;
	private boolean soundOn = true;
	private Clip clip;
	private AudioInputStream ais;
	
	
	static final int START_X = 300;
	static final int START_Y = 150;
	static final int WIDTH = 20;
	static final int HEIGHT = 40;
	private List<TurtleListener> myListeners;
}
