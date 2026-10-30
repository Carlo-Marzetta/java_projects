import java.util.ArrayList;

public class Bishop extends ChessFigureIF {

	Bishop(boolean isWhite, int pos) {
		super(isWhite, pos);
		// TODO Auto-generated constructor stub
	}
	
	public static Position[] getPossibles(int[] startingPos) {
		int[] pointer = startingPos;
		ArrayList<Position>pos = new ArrayList<Position>();
		for (int i = -1; i < 2; i+=2) {
			for (int j = -1; j < 2; j+=2) {
				while (pointer[0] <= 8 && pointer[0] >= 1 && pointer[0] <= 8 && pointer[0] >= 1) {
					pos.add(new Position(pointer[0], pointer[1]));
				}
			}			
		}
	}

}
