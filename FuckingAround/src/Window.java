import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Window extends JFrame 
{
	private Board _board;
	private Dimension _fullHD;
	private Dimension _HD;
	
	Window()
	{
		init();
	}
	
	private void init()
	{
		_fullHD = new Dimension(1920, 1080);
		_HD     = new Dimension(1280, 720);
		
		_board = new Board();
		this.setLayout(new BorderLayout());
		
		this.add(_board, BorderLayout.CENTER);
		
		
		this.setSize(_HD);
		this.setVisible(true);
		this.repaint();
	}
	
	public static void main(String[] args) {
		new Window();
	}
}
