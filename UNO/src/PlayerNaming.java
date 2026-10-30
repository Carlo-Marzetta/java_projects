/*
 * JPanel that allows the players to be named
 * 
 * @version 1.0
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PlayerNaming extends JPanel
{
	
	GameManager m_GM;
	float fontSize = 25.0f;
	Image m_Background;
	JLabel one, two, three, four;
	JTextField o, t,th, f;
	JButton next;
	JButton back;
	
	
	PlayerNaming(GameManager gm, String backgroundPath)
	{
		m_GM = gm;
		try {
			m_Background = ImageIO.read(new File(backgroundPath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		JPanel playerNames = new JPanel();
		playerNames.setOpaque(false);
		
		next = new JButton();
		back = new JButton();
		
		next.add(new JLabel(new ImageIcon("resources/UI/next.PNG")));
		back.add(new JLabel(new ImageIcon("resources/UI/back.PNG")));


		

		  
		  
		next.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println(m_GM);
				m_GM.game();
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				m_GM.mainMenu();
			}
		});
		
		
		one = new JLabel("Player 1");
		two = new JLabel("Player 2");
		three = new JLabel("Player 3");
		four = new JLabel("Player 4");
		
		one.setFont(one.getFont().deriveFont(fontSize));
		two.setFont(one.getFont().deriveFont(fontSize));
		three.setFont(one.getFont().deriveFont(fontSize));
		four.setFont(one.getFont().deriveFont(fontSize));
		
		one.setForeground(Color.YELLOW);
		two.setForeground(Color.YELLOW);
		three.setForeground(Color.YELLOW);
		four.setForeground(Color.YELLOW);
		
		o = new JTextField(15);
		t = new JTextField(15);
		th = new JTextField(15);
		f = new JTextField(15);
		
		o.setBounds(5, 5, 15, 2);
		o.setPreferredSize(new Dimension(15, 2));

		
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		
		c.fill = GridBagConstraints.VERTICAL;
		c.anchor = GridBagConstraints.CENTER;
		playerNames.setLayout(new GridLayout(4, 2, 1, 40));
		playerNames.add(one);
		playerNames.add(o);
		playerNames.add(two);
		playerNames.add(t);
		playerNames.add(three);
		playerNames.add(th);
		playerNames.add(four);
		playerNames.add(f);
		
		
		
		c.fill = GridBagConstraints.VERTICAL;
		c.ipady = 200;      //make this component tall
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		add(playerNames, c);
		
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.SOUTHEAST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 4;
		add(next, c);
		
		
		c.gridx = 0;
		c.gridy = 4;
		add(back, c);
		

	}
	
	/*
	 * returns the inserted names in a string array
	 * @return string array with the names
	 */
	public String[] getNames()
	{
		if(o.getText().length() < 1)
		{
			o.setText("Player 1");
		}
		if(t.getText().length() < 1)
		{
			t.setText("Player 2");
		}
		if(th.getText().length() < 1)
		{
			th.setText("Player 3");
		}
		if(f.getText().length() < 1)
		{
			f.setText("Player 4");
		}
		
		return new String[] {o.getText(), t.getText(), th.getText(), f.getText()};
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(m_Background, 0, 0, this);
	}
}
