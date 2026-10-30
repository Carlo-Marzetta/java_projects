/*
 * JDialog that shows the final scores of a game
 * 
 * @version 1.0
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WinScreen extends JDialog {

	JLabel JLmessage,JLmessage2;
	JLabel JRanking, Jp1, Jp2, Jp3, Jp4;
	String[] m_Names;
	int[] m_Scores;
	JButton verlassen, revanche;
	GameManager m_GM;
	
	WinScreen(GameManager gm, String[] names, int[] scores)
	{
		m_Names = names;
		m_Scores = scores;
		m_GM = gm;
		adden(this);
		setSize(1280, 720);
		setVisible(true);
	
	}
	void adden(JDialog jf) {
		//JFrame wird erstellt
		jf.setLayout(new BorderLayout());
		
		//Panels werden erstellt und das Layout wird festgellegt
		JPanel oberPanel, untePanel, JPmessage, JPmessage2, jSpace, JoPRangliste1, JPRangliste1, JPRangliste2, JPRangliste3, JPRangliste4;
		JPmessage = new JPanel();
		JPmessage2 = new JPanel();
		
		oberPanel = new JPanel();
		oberPanel.setLayout(new BorderLayout());
		
		untePanel = new JPanel();
		untePanel.setLayout(new BorderLayout());
		
		//Revanche und neues Spiel Knopf werden hier erstellt und hinzugefügt
		verlassen = new JButton("Spiel verlassen");
		revanche = new JButton("Revanche");
		
		untePanel.add(revanche, BorderLayout.WEST);
		untePanel.add(verlassen, BorderLayout.EAST);
		//Glückwunschnachricht wird erstellt.
		JPmessage.setLayout(new BorderLayout());
		
		JLmessage = new JLabel("<html><body><center>Herzlichen Glückwunsch</center></body></html>", SwingConstants.CENTER);
		JLmessage2 = new JLabel("<html><b><center>" + m_GM.getWinner().getName() + " hat das Spiel gewonnen!</center></b></html>", SwingConstants.CENTER);
		JLmessage.setFont(JLmessage.getFont().deriveFont(55f));
		JLmessage2.setFont(JLmessage2.getFont().deriveFont(25f));
		
		JPmessage.add(JLmessage, BorderLayout.NORTH);
		JPmessage.add(JLmessage2, BorderLayout.SOUTH);
		
		//Rangliste wird erstellt
		JoPRangliste1 = new JPanel();
		JoPRangliste1.setLayout(new BorderLayout());
		JPRangliste1 = new JPanel();
		JPRangliste1.setLayout(new BorderLayout());
		JPRangliste2 = new JPanel();
		JPRangliste2.setLayout(new BorderLayout());
		JPRangliste3 = new JPanel();
		JPRangliste3.setLayout(new BorderLayout());
		JPRangliste4 = new JPanel();
		JPRangliste4.setLayout(new BorderLayout());
		
		//Ranking JLabels werden erstellt und eingefügt.
		JRanking = new JLabel("Rang: \t\t\t\t\t\t Spieler: \t\t\t\t\t\t Punkte:", SwingConstants.CENTER);
		Jp1 = new JLabel("1. \t\t\t\t\t\t "+ m_Names[3] + " \t\t\t\t\t\t " + m_Scores[3], SwingConstants.CENTER);
		Jp2 = new JLabel("1. \t\t\t\t\t\t "+ m_Names[2] + " \t\t\t\t\t\t " + m_Scores[2], SwingConstants.CENTER);
		Jp3 = new JLabel("1. \t\t\t\t\t\t "+ m_Names[1] + " \t\t\t\t\t\t " + m_Scores[1], SwingConstants.CENTER);
		Jp4 = new JLabel("1. \t\t\t\t\t\t "+ m_Names[0] + " \t\t\t\t\t\t " + m_Scores[0], SwingConstants.CENTER);
		JRanking.setFont(JRanking.getFont().deriveFont(25f));
		Jp1.setFont(Jp1.getFont().deriveFont(25f));
		Jp2.setFont(Jp2.getFont().deriveFont(25f));
		Jp3.setFont(Jp3.getFont().deriveFont(25f));
		Jp4.setFont(Jp4.getFont().deriveFont(25f));
		verlassen.setFont(verlassen.getFont().deriveFont(30f));
		//verlassen.setPreferredSize(new Dimension(50, 50));
		revanche.setFont(revanche.getFont().deriveFont(30f));
		//revanche.setPreferredSize(new Dimension(50, 50));
		
		JPRangliste1.add(JRanking, BorderLayout.NORTH);
		JPRangliste2.add(Jp1, BorderLayout.NORTH);
		JPRangliste2.add(Jp2, BorderLayout.SOUTH);
		JPRangliste3.add(Jp3, BorderLayout.NORTH);
		JPRangliste3.add(Jp4, BorderLayout.SOUTH);
		
		verlassen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				m_GM.rip();
				dispose();
			}
		});
		revanche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				m_GM.revanche(WinScreen.this);
			}
		});
		
		JPRangliste4.add(JPRangliste2, BorderLayout.NORTH);
		JPRangliste4.add(JPRangliste3, BorderLayout.SOUTH);
		
		JoPRangliste1.add(JPRangliste1, BorderLayout.NORTH);
		JoPRangliste1.add(JPRangliste4, BorderLayout.SOUTH);
		
		oberPanel.add(JPmessage, BorderLayout.NORTH);
		oberPanel.add(JoPRangliste1, BorderLayout.SOUTH);
		
		untePanel.setBorder(BorderFactory.createEmptyBorder(10, 250, 10, 10)); 
		
		jf.add(oberPanel, BorderLayout.NORTH);
		jf.add(untePanel, BorderLayout.SOUTH);
		
	}
}
