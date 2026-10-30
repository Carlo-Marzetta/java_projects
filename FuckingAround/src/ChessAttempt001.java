import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.util.*;



public class ChessAttempt001 extends JFrame
{
	
	public static void main(String[] args)
	{
		ChessAttempt001 c = new ChessAttempt001();
	}
	
	Color white;
	Color black;
	Icon peasant_White, bishop_White, knight_White, rock_White, queen_White, king_White;
	Icon peasant_Black, bishop_Black, knight_Black, rock_Black, queen_Black, king_Black;
	HashMap m_ChessFigures;
	
	
	ChessAttempt001()
	{
		//INITIALIZE STUFF
		m_ChessFigures = new HashMap<Integer, ChessFigureIF>();
		white = new Color(255, 255, 255);
		black = new Color(77, 38, 00);
		
		
		
		//Layout Setting
		
		
		
		
		
		setVisible(true);
	}
}
