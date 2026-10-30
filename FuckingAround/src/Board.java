import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class Board extends JPanel {
	
	private ArrayList<Square> _squares;
	private Color _lightSquares;
	private Color _darkSquares;
	
	
	Board()
	{
		this.setLayout(new GridLayout(8, 8));
		
		init(Color.WHITE, Color.BLACK);
	}

	public void init(Color ls, Color ds)
	{
		_squares = new ArrayList<Square>();
		Square currentSquare;

		for (int i = 0; i < 64; i++) {
			currentSquare = new Square( 1 == i % 2 ? _darkSquares : _lightSquares, i);
			// System.out.println(currentSquare);
			this.add(currentSquare);
			_squares.add(currentSquare);
		}
		
		
		this.setVisible(true);
	}

	public void setupBoard()
	{
		for (int pwns = 0; pwns < 8; ++pwns) {
			
		}
	}
}
