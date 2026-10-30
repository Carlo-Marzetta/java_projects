import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel
{
	JButton reset;
	JLabel score;
	JButton nextRound;
	Frame frame;
	
	
	Menu(Frame f)
	{
		frame = f;
		reset = new JButton("Reset");
		nextRound = new JButton("next Round");
		score = new JLabel("0:0");
		
		this.add(score, BorderLayout.CENTER);
		JPanel right = new JPanel();
		
		right.add(reset, BorderLayout.EAST);
		right.add(nextRound, BorderLayout.WEST);
		
		this.add(right, BorderLayout.EAST);
		
		
		
		
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.restart();
			}			
		});
		
		nextRound.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.restart();
			}			
		});
	}
	
}
