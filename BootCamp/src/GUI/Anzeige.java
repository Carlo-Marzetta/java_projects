package GUI;

import java.awt.Color;

import javax.swing.*;

public class Anzeige 
{
	JTextField eingabeFeld;
	JButton b;
	JLabel label;

	
	void init()
	{
		JFrame jf;
		jf = new JFrame("Me Nam JeFf");
		
		bevolkern(jf);
		
		jf.setSize(1920, 1080);
		jf.setVisible(true);
		
	}
	
	
	private void bevolkern (JFrame myFrame)
	{
		JPanel p = new JPanel();
		myFrame.add(p);
		
		b = new JButton("It is Wednesday me dudes");
		label = new JLabel("Ausgabe");
		label.setForeground(Color.white);
		eingabeFeld = new JTextField("Eingabefeld");
		
		p.setBackground(Color.BLACK);
		//myFrame.add(new JLabel("<html>Text color: <font color='white'>red</font></html>"));
		p.add(eingabeFeld);
		p.add(b);
		p.add(label);

		
	}
}
