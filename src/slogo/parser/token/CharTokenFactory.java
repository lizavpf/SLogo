package slogo.parser.token;

import slogo.CharConsts;

/**
 * Factory for generating CharToken objects ensuring that only one of any
 * specific CharToken object is created (enforcing CharToken singleton-ness per
 * char value)
 * 
 * @author Owen Astrachan
 */
public class CharTokenFactory {
	public static CharToken getToken(int ch) {
		if (tokenList[ch] == null) {
			tokenList[ch] = new CharToken(ch);
		}
		return tokenList[ch];
	}

	private static CharToken[] tokenList = new CharToken[256];

	static {
		tokenList[CharConsts.LEFT_PAREN] = new LeftParenToken();
		tokenList[CharConsts.RIGHT_PAREN] = new RightParenToken();
		tokenList[CharConsts.LEFT_BRACKET] = new LeftBracketToken();
		tokenList[CharConsts.RIGHT_BRACKET] = new RightBracketToken();
		tokenList[CharConsts.EQUAL] = new EqualsToken();
	}
}
