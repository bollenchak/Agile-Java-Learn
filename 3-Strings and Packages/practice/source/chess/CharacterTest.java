package chess;

import java.util.*;
import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() {
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertTrue(Character.isWhitespace(' '));
		//»Ø³µ
		assertTrue(Character.isWhitespace('\r'));
		//»»Ò³
		assertTrue(Character.isWhitespace('\f'));
		
		//ÍË¸ñ
		assertFalse(Character.isWhitespace('\b'));
		assertFalse(Character.isWhitespace('x'));
	}

	public void testJavaIdentifierPart() {
		assertTrue(Character.isJavaIdentifierPart('a'));
		assertTrue(Character.isJavaIdentifierPart('_'));
		assertTrue(Character.isJavaIdentifierPart('$'));
		assertTrue(Character.isJavaIdentifierPart('0'));

		assertFalse(Character.isJavaIdentifierPart('-'));
		assertFalse(Character.isJavaIdentifierPart('^'));
		assertFalse(Character.isJavaIdentifierPart('+'));
		
	}
}