package slogo.parser;

import java.util.*;

import slogo.*;
import slogo.expression.VariableFactory;
import slogo.instruction.StrictInstructionList;
import slogo.instruction.Subroutine;
import slogo.parser.token.*;

/**
 * Instruction Parser - calls appropriate Parser for each Instruction
 * 
 * @author Owen Astrachan
 */
public class InstructionParser implements Parser {

	private Map<Class<?>, Parser> myParserMap;
	private static InstructionParser ourInstance;

	/**
	 * 
	 * @return the one InstructionParser object
	 */
	public static InstructionParser getInstance() {
		if (ourInstance == null) {
			ourInstance = new InstructionParser();
		}
		return ourInstance;
	}

	/**
	 * Create the InstructionParser--generates a map of classes to parsers
	 */
	private InstructionParser() {
		myParserMap = new HashMap<>(1001);
		String thisPackage = "slogo.parser.";

		Properties it = InstructionNames.getAliases();
		Enumeration<?> eNum = it.propertyNames();
		while (eNum.hasMoreElements()) {
			String instName = (String) eNum.nextElement();
			String valueParserName = it.getProperty(instName);
			String tokenName = thisPackage + "token." + instName + "Token";
			String parserName = thisPackage + valueParserName + "Parser";
			Class<?> tokenClass = null;
			try {
				tokenClass = Class.forName(tokenName);
			} catch (ClassNotFoundException e) {
				throw new ParseException(tokenName + " not found " + e);
			}
			try {
				Parser p = (Parser) Class.forName(parserName).newInstance();
				myParserMap.put(tokenClass, p);
			} catch (ClassNotFoundException e) {
				throw new ParseException(parserName + " not found " + e);
			} catch (InstantiationException e) {
				throw new ParseException(parserName + " not instantiated " + e);
			} catch (IllegalAccessException e) {
				throw new ParseException(parserName + " not creatable " + e);
			}
		}
	}

	/**
	 * gets the appropriate parser to parse the token
	 */
	@Override
	public GrammarElement parse(SLogoInterpreter slogoInterpreter) {
		Token t = slogoInterpreter.getToken();
		if (t instanceof NumberToken) {
			slogoInterpreter.nextToken();
			return new slogo.expression.Number(((NumberToken) t).value());
		} else if (t instanceof IdentifierToken) {
			try {
				AssignmentParser ap = new AssignmentParser();
				return ap.parse(slogoInterpreter);
			} catch (ParseException e) { // no equals sign so fall back to it's just a variable.
				Context currentContext = slogoInterpreter.getContext();
				String name = t.toString();
				Object value = currentContext.value(name);
				if (!(value instanceof StrictInstructionList)) {
					return VariableFactory.getVariable((IdentifierToken) t);
				} else {
					return (StrictInstructionList) value;
				}
			}
		}

		Parser p = myParserMap.get(t.getClass());

		if (p == null) {
			throw new ParseException("no parser for " + t.getClass());
		}
		return p.parse(slogoInterpreter);
	}

}
