
/*
 * The JPanel on which the game takes place
 * 
 * @version 1.0
 */

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameBoard extends JPanel
{
	JPanel m_ScoreBoard, m_Management;
	Image m_Background;
	Instructions m_Instructions;
	Player m_P1, m_P2, m_P3, m_P4;
	Pile m_Pile;
	Deck m_Deck;
	
	
	GameBoard(Scoreboard scoreboard, Management management, Pile pile, Instructions inst, Deck d, Player p1, Player p2, Player p3, Player p4)
	{
		setLayout(new GridLayout(3, 3));
		
		try {
			m_Background = ImageIO.read(new File("resources/UI/gamebackground.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		m_Management = management;
		m_Instructions = inst;
		m_Deck = d;
		m_P1 = p1;
		m_P2 = p2;
		m_P3 = p3;
		m_P4 = p4;
		m_Pile = pile;
		
		add(scoreboard);
		add(m_P3);
		add(m_Management);
		add(m_P4);
		add(m_Pile);
		add(m_P2);
		add(m_Instructions);
		add(m_P1);
		add(m_Deck.getPanel());


	}
	
	
	/*
	 * removes everything from the panel
	 */
	public void killAll()
	{
		removeAll();
		revalidate();
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(m_Background, 0, 0, this);
	}
}
