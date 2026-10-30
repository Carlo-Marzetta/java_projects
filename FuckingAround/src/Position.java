import java.util.ArrayList;


public class Position {
	private String file;
	private int rank;
	private int[] pos;
	private static char[] fileToInt = new char[] {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; 
	private ChessColor squareColor;
	
	Position(int x, int y) {
		
	}
	
	public int[] getCartesian() {
		int[] coords = new int[2];
		coords[1] = rank;
		
		return coords;
	}
	
	public void setCartesian(int x, int y) {
		
	}
	
	public String getNotation() {
		return file + Integer.toString(rank);
	}
	
	private int charToNum (char c) {
		ArrayList<char> chars = new ArrayList<char>(fileToInt);
		
		return chars.indexOf(c);
	}
}
