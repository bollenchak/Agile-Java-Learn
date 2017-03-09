package chess;

import java.util.*;
import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() {
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertTrue(Character.isWhitespace(' '));
		//�س�
		assertTrue(Character.isWhitespace('\r'));
		//��ҳ
		assertTrue(Character.isWhitespace('\f'));
		
		//�˸�
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