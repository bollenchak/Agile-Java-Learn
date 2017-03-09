package chess;

import java.util.*;
import chess.pieces.Pawn;

/**
 * provide a chess board
 * inclue Pawn just now.
 * @author administrator
 */
public class Checkerboard {
	private List<Pawn> whitePawns;
	private List<Pawn> blackPawns;
	public static int AVAILABLE_PIECES_NUMBER = 16;
	public static String WHITE_PAWNS_PRINT = "pppppppp";
	public static String BLACK_PAWNS_PRINT = "PPPPPPPP";
	public static String NEW_LINE = System.getProperty("line.separator");
	public static String ROW_BLANK_GRID = "........";

	/**
	 * constructs a chess board , instance a pawn list
	 */
	public Checkerboard() {
		this.whitePawns = new ArrayList<Pawn>();
		this.blackPawns = new ArrayList<Pawn>();
		this.initialize();
	}

	private void initialize() {
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));
		this.whitePawns.add(new Pawn(Pawn.COLOR_WHITE,Pawn.PRINT_WHITE));

		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
		this.blackPawns.add(new Pawn(Pawn.COLOR_BLACK,Pawn.PRINT_BLACK));
	}

	public int getAvailablePiecesNumber(){
		return this.whitePawns.size() + this.blackPawns.size();
	}

	public String getWhitePawnsPrint(){
		StringBuffer buffer = new StringBuffer();
		for(Pawn pawn : whitePawns) {
			buffer.append(pawn.getPrint());
		}
		return buffer.toString();
	}

	public String getBlackPawnsPrint(){
		StringBuffer buffer = new StringBuffer();
		for(Pawn pawn : blackPawns) {
			buffer.append(pawn.getPrint());
		}
		return buffer.toString();
	}

	public String getCheckerboardPrint() {
		StringBuffer buffer = new StringBuffer();
		this.printBlackSide(buffer);
		this.printMidBlankArea(buffer);
		this.getWhiteSide(buffer);
		return buffer.toString();
	}

	private void printBlackSide(StringBuffer buffer){
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
		buffer.append(this.getBlackPawnsPrint());
	}

	private void printMidBlankArea(StringBuffer buffer){
		buffer.append(NEW_LINE);
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
	}

	private void getWhiteSide(StringBuffer buffer){
		buffer.append(this.getWhitePawnsPrint());
		buffer.append(NEW_LINE);
		buffer.append(ROW_BLANK_GRID);
		buffer.append(NEW_LINE);
	}
}