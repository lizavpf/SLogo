package slogo.parser.token;

import java.io.StreamTokenizer;
import java.io.IOException;
import java.util.*;

import slogo.parser.*;

/**
 * Parses a stream into tokens
 * 
 * @author Owen Astrachan
 */
public class TokenFactory {

	private static Map<String, Token> tokenNameToToken = new TreeMap<String, Token>();

	private static final String thisPackage = "slogo.parser.token.";
	static {
		
		Iterator<String> it = InstructionNames.getNames();
		/**
		 * Generate the tokens from the instruction names
		 */
		while (it.hasNext()) {
			String resName = it.next();
			mapReservedTokenToTokenClass(resName, resName); 
		}
		mapReservedTokenToTokenClass("LESS?", "Less");
		mapReservedTokenToTokenClass("GREATER?", "Greater");
		mapReservedTokenToTokenClass("EQUAL?", "Equal");
		mapReservedTokenToTokenClass("NOTEQUAL?", "NotEqual");
		mapReservedTokenToTokenClass("PENDOWN?", "PenDownP");
	}

	private static void mapReservedTokenToTokenClass(String resName, String tokenName) {
		tokenName = thisPackage + tokenName + "Token";
		Class<?> tokenClass = null;
		Token t = null;
		try {
			tokenClass = Class.forName(tokenName);
			t = (Token) tokenClass.newInstance();
			tokenNameToToken.put(resName.toUpperCase(), t);
		} catch (ClassNotFoundException e) {
			throw new ParseException(tokenName + " not found " + e);
		} catch (InstantiationException e) {
			throw new ParseException(tokenName + " not instantiated " + e);
		} catch (IllegalAccessException e) {
			throw new ParseException(tokenName + " not createable " + e);
		}
	}

	/**
	 * 
	 * @param tokenizer
	 * @return the next Token on the stream
	 */
	public static Token parse(StreamTokenizer tokenizer) {
		try {
			int result = tokenizer.nextToken();

			switch (result) {
			case StreamTokenizer.TT_EOF:
				return EOFToken.getInstance();
			case StreamTokenizer.TT_EOL:
				return EOLToken.getInstance();
			case StreamTokenizer.TT_NUMBER:
				return new NumberToken(tokenizer.nval);
			case StreamTokenizer.TT_WORD:

				Token t = tokenNameToToken.get(tokenizer.sval.toUpperCase());

				// If there is no token with the parsed name, the token must be
				// an identifier
				if (t == null) {
					return new IdentifierToken(tokenizer.sval);
				} else {
					return t;
				}
			default:
				return CharTokenFactory.getToken(result);
			}

		} catch (IOException io) {
			throw new ParseException("io problem " + io);
		}
	}

}
