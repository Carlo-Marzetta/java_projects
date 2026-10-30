/*
 * JDialog that pauses the game
 * 
 * @version 1.0
 */


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PauseScreen extends JDialog
{
	PauseScreen(GameManager gm)
	{
		super(gm, "Game Paused", true);
		setSize(700, 350);

		setLayout(new BorderLayout());
		add(new JLabel("Game Paused"), BorderLayout.NORTH);
		JPanel buttons = new JPanel();
		JButton play = new JButton("Continue");
		play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		
		buttons.setLayout(new BorderLayout());
		buttons.add(play, BorderLayout.CENTER);
		add(buttons, BorderLayout.SOUTH);
		setVisible(true);
	}
}
