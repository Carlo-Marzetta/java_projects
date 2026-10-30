package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rechner 
implements ActionListener
{
	Anzeige a;

	public void actionPerformed(ActionEvent arg0) 
	{
		System.out.println("Me Nam Jeff and me want to kill me");
		
		String eingabe = a.eingabeFeld.getText();
		
		
		int i = Integer.parseInt(eingabe);
		
		i = i * 21;
		
		a.label.setText("JEFF IST :" + i + " JAHRE ALT");
	}
	
}
