import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
	}
	
	
	
	String current = "X";
	Game game;
	Menu menu;
	
	Frame()
	{
		init();	
	}
	
	
	private void init()
	{
		game = new Game(this);
		menu = new Menu(this);
		
		this.add(game, BorderLayout.CENTER);
		this.add(menu, BorderLayout.NORTH);

		this.setSize(500, 700);
		this.setVisible(true);
		repaint();
		this.revalidate();
	}
	
	
	public String getCurrentPlayer()
	{
		if(current == "X")
		{
			current = "O";
			return "X";
		}
		else
		{
			current ="X";
			return "O";
		}
	}
	
	public void restart()
	{
		this.removeAll();
		init();
	}
}
