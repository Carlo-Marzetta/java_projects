package UserInterface;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Header extends JPanel
{
	
	JLabel m_Clock = new JLabel();
	
	Header()
	{
		Timer t = new Timer(1000, updateClockAction);
		t.start();
		
		setLayout(new BorderLayout(10, 10));
		
		JLabel title = new JLabel("Zugabfahrtsplan");
		title.setFont(new Font("OCR", Font.PLAIN, 32));
		
		add(title, BorderLayout.CENTER);
		add(m_Clock, BorderLayout.EAST);
	}
	
	
	
	ActionListener updateClockAction = new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		      // Assumes clock is a custom component
			  Long time = System.currentTimeMillis();
			  
			  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss -- MMM dd");    
			  Date resultdate = new Date(time);
			  
		      m_Clock.setText(sdf.format(resultdate)); 
		    }
		};
}
