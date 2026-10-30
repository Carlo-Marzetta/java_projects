/*
 * Console to instruct the players
 * 
 * @version 1.0
 */


import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Instructions extends JPanel
{
	static JTextArea m_Console;
	
	Instructions()
	{
		setOpaque(false);
		m_Console = new JTextArea(10, 30);
		add(new JScrollPane(m_Console));
	}
	
	
	/*
	 * prints out a string in the in-game console
	 * @param the text 
	 */
	public static void print(String s)
	{
		try
		{
			m_Console.setText(s + "\n");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
