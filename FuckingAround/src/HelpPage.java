import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HelpPage extends JFrame
{
	JLabel m_Helpingtext;
	JButton m_Exit;
	
	HelpPage()
	{
		setSize(200, 100);
		setLayout(new GridLayout(2, 1, 20, 20));
		m_Helpingtext = new JLabel("This program was written to annoy the shit out of you so fuck off.");
		m_Exit = new JButton("Exit");
		
		m_Exit.addActionListener(new KeyListener());
		add(m_Helpingtext);
		add(m_Exit);
		
		
		setVisible(true);
	}
	
	
	
	public class KeyListener implements ActionListener
	{
 

		public void actionPerformed(ActionEvent e) 
		{
			dispose();
		}
	}
}
