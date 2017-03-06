package chess.pieces;

public class Pawn {
	public final static String COLOR_WHITE = "white";
	public final static String COLOR_BLACK = "black";

	private String color;
	
	public Pawn(String color){
		this.color = color;
	}

	public Pawn() {
		this.color = COLOR_WHITE;
	}

	public String getColor() {
		return this.color;
	}
}