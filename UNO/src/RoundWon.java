/*
 * JDialog that announces that a round has been won
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

public class RoundWon extends JDialog
{
	
	JPanel roundResults;
	RoundWon(GameManager gm)
	{
		super(gm, "Round Over", true);
		setSize(1280, 720);
		setLayout(new BorderLayout());
		JButton nxtRound = new JButton("Continue");
		nxtRound.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
			
		});
		add(nxtRound, BorderLayout.SOUTH);
		roundResults = new JPanel();
		JLabel congrats = new JLabel("Congratulations!!");
		congrats.setFont(congrats.getFont().deriveFont(35f));
		roundResults.add(congrats);
		add(roundResults);
		setVisible(true);
	}
	
	
	/*
	 * sets the winner
	 * @param the winner and his score
	 */
	public void setWinner(Player p, int score)
	{
		roundResults.add(new JLabel(p.getName() + " has won the round and now has " + score + " points."));
		revalidate();
		repaint();
	}
}
