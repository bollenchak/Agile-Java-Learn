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
	public void testAddPawn() {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE);
		board.addPawn(whitePawn);

		List<Pawn> pawns = board.getPawns();
		assertEquals(1 , pawns.size());
		assertEquals(Pawn.COLOR_WHITE , pawns.get(0).getColor());

		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK);
		board.addPawn(blackPawn);
		assertEquals(2 , pawns.size());
		assertEquals(Pawn.COLOR_BLACK , pawns.get(1).getColor());

		//Integer无法转换Pawn类型
		// board.addPawn(new Integer("7"));
	}
}