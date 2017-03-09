package chess;

import junit.framework.TestCase;
import java.util.*;
import chess.pieces.Pawn;
import chess.pieces.PawnTest;

public class CheckerboardTest extends TestCase {
	private Checkerboard board;

	public void setUp() {
		board = new Checkerboard();
	}

	public void testPiecesNumber() {
		assertEquals(Checkerboard.AVAILABLE_PIECES_NUMBER,board.getAvailablePiecesNumber());
	}

	public void testCreate() {
		assertEquals(Checkerboard.WHITE_PAWNS_PRINT,board.getWhitePawnsPrint());
		assertEquals(Checkerboard.BLACK_PAWNS_PRINT,board.getBlackPawnsPrint());
	}

	public void testPrintCheckerboard() {
		String boardPrint = Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE +
		board.getBlackPawnsPrint() + Checkerboard.NEW_LINE +
		Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE +
		Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE +
		Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE +
		Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE +
		board.getWhitePawnsPrint()  + Checkerboard.NEW_LINE +
		Checkerboard.ROW_BLANK_GRID + Checkerboard.NEW_LINE;
System.out.println(board.getCheckerboardPrint());
		assertEquals(boardPrint,board.getCheckerboardPrint());
	}
}