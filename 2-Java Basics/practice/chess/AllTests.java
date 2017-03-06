package chess;

import chess.pieces.PawnTest;
import junit.framework.TestSuite;
public class AllTests {
	
	public static TestSuite suite () {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(PawnTest.class);
		suite.addTestSuite(CheckerboardTest.class);
		return suite;
	}

}