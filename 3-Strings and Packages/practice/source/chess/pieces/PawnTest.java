package chess.pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase{

	public void testCreate() {
		Pawn pawn = new Pawn(Pawn.COLOR_WHITE);
		assertEquals(Pawn.COLOR_WHITE,pawn.getColor());

		Pawn secondPawn = new Pawn(Pawn.COLOR_BLACK);
		assertEquals(Pawn.COLOR_BLACK , secondPawn.getColor());

		Pawn pawn3 = new Pawn();
		assertEquals(Pawn.COLOR_WHITE , pawn3.getColor());
	}

	public void testPrint() {
		Pawn pawn = new Pawn(Pawn.COLOR_WHITE, Pawn.PRINT_WHITE);
		assertEquals(Pawn.PRINT_WHITE,pawn.getPrint());
		Pawn secondPawn = new Pawn(Pawn.COLOR_BLACK, Pawn.PRINT_BLACK);
		assertEquals(Pawn.PRINT_BLACK , secondPawn.getPrint());
	}
} 