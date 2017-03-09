package chess.pieces;

public class Pawn {
	public final static String COLOR_WHITE = "white";
	public final static String COLOR_BLACK = "black";

	public final static char PRINT_BLACK = 'P';
	public final static char PRINT_WHITE = 'p';

	private String color;
	private char c;
	
	public Pawn(String color, char c){
		this.color = color;
		this.c = c;
	}

	public Pawn(String color){
		this.color = color;
	}

	public Pawn() {
		this.color = COLOR_WHITE;
	}

	public String getColor() {
		return this.color;
	}

	public char getPrint() {
		return this.c;
	}
}