package chess;

import java.util.*;
import chess.pieces.Pawn;

/**
 * provide a chess board
 * inclue Pawn just now.
 * @author administrator
 */
public class Checkerboard {
	private List<Pawn> pawns;

	/**
	 * constructs a chess board , instance a pawn list
	 */
	public Checkerboard() {
		this.pawns = new ArrayList<Pawn>();
	}

	public void addPawn(Pawn pawn) {
		this.pawns.add(pawn);
	}

	public List<Pawn> getPawns() {
		return this.pawns;
	}
}