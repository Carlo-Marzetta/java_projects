/*
 * The JPanel on which the main menu is displayed
 * 
 * @version 1.0
 */



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel
{
	Image m_Background;
	JButton m_Play;
	GameManager m_GM;
	
	MainMenu(String backgroundImageName, GameManager gm) throws IOException
	{
		m_GM = gm;
		setLayout(new BorderLayout());
		m_Background = ImageIO.read(new File(backgroundImageName));
		
		ImageIcon img = new ImageIcon("resources/UI/PLAY.PNG");
		Image image = img.getImage();
		Image newImage = image.getScaledInstance(300, 175, Image.SCALE_SMOOTH);
		img = new ImageIcon(newImage);
		
		m_Play = new JButton();
		m_Play.add(new JLabel(img));
		m_Play.setPreferredSize(new Dimension(300, 175));
		m_Play.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				play();
			}
		});
		
		JPanel south = new JPanel();
		south.setLayout(new GridLayout(1, 3, 50, 50));
		south.setOpaque(false);
		JPanel l,r;
		l = new JPanel();
		r = new JPanel();
		l.setOpaque(false);
		r.setOpaque(false);
		south.add(l);
		south.add(m_Play);
		south.add(r);
		add(south);
		ImageIcon logoimg = new ImageIcon("resources/UI/UnoLogo.PNG");
		JLabel logo = new JLabel(logoimg);
		JPanel playBtn = new JPanel();
		playBtn.setLayout(new GridBagLayout());
		GridBagConstraints c = 	new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		playBtn.add(logo, c);
		playBtn.setOpaque(false);
		add(playBtn, BorderLayout.NORTH);
		
	}
	
	
	void play()
	{
		m_GM.playerNaming();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(m_Background, 0, 0, this);
	}
}
