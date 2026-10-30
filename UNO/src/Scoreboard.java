/*
 * JPanel on the game board that shows the player's scores
 * 
 * @version 1.0
 */


import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard extends JPanel implements Observer
{
	int[] m_Scores = new int[] {0, 0, 0, 0};
	JLabel[] m_PlayerNames;

	
	Scoreboard(String[] names, int[] scores)
	{
		setLayout(new GridLayout(4, 1));
		m_Scores = scores;
		m_PlayerNames = new JLabel[4];
		setOpaque(false);
		for(int i = 0; i < 4; i++)
		{
			m_PlayerNames[i] = new JLabel(names[i]);
		}
		
		implementScores();
	}
	
	/*
	 * recieves the scores
	 */
	public void update(Observable arg0, Object scoreArray) 
	{
		m_Scores = (int[])scoreArray;
	}
	
	
	void implementScores()
	{
		removeAll();
		for(int i = 0; i < 4; i++)
		{
			m_PlayerNames[i] = new JLabel(m_PlayerNames[i].getText()+ ":     " + m_Scores[i]);
			add(m_PlayerNames[i]);
		}
	}
	
	
	

}
