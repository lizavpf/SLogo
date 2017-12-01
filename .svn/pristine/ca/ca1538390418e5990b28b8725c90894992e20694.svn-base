package slogo.parser;

import java.util.*;
import java.io.*;
import java.net.URL;

/**
 * Reads the file of instruction names.
 * 
 * @author Owen Astrachan
 * 
 */
public class InstructionNames {

	private static List<String> instructions = new ArrayList<String>();
	private static String PROPFILE = "slogo/parser/instructions.prop";
	private static Properties tokenNamesToParserNames = new Properties();

	static {
		initialize();
	}

	/**
	 * initialize the class by reading the instructions from a property file
	 */
	private static void initialize() {
		InstructionNames temp = new InstructionNames();
		try {
			URL url = temp.getClass().getClassLoader().getResource(PROPFILE);
			tokenNamesToParserNames.load(url.openStream());
			Enumeration<?> e = tokenNamesToParserNames.propertyNames();

			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				instructions.add(name);
			}
		} catch (IOException e) {
			System.err.println("trouble loading " + PROPFILE);
		}
	}

	/**
	 * 
	 * @return an iterator of the instruction names
	 */
	public static Iterator<String> getNames() {
		return instructions.iterator();
	}
	
	public static Properties getAliases() {
		return tokenNamesToParserNames;
	}

}
