/*
 * JPanel on the game board that manages pause and volume
 * 
 * @version 1.0
 */



import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Management extends JPanel
{
	Management(GameManager gm)
	{
		setOpaque(false);
		setLayout(new BorderLayout());
		JPanel top = new JPanel();
		top.setOpaque(false);
		JPanel right = new JPanel();
		right.setOpaque(false);
		top.add(right, BorderLayout.EAST);
		JButton pause = new JButton();

		JButton mute = new JButton();
		ImageIcon img;
		img = new ImageIcon("resources/UI/MUTE.PNG");
		Image image = img.getImage();
		Image newImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		img = new ImageIcon(newImage);
		
		
		ImageIcon pimg;
		pimg = new ImageIcon("resources/UI/PAUSE.PNG");
		Image pimage = pimg.getImage();
		Image pnewImage = pimage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		pimg = new ImageIcon(pnewImage);
		
		JLabel muteIcon = new JLabel(img);
		JLabel pauseIcon = new JLabel(pimg);
		pause.add(pauseIcon);
		mute.add(muteIcon);
		pause.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				PauseScreen ps = new PauseScreen(gm);
			}
			
		});
		
		mute.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				gm.turnMusic();
			}
		});
		
		right.add(mute, BorderLayout.WEST);
		right.add(pause, BorderLayout.EAST);
		add(top, BorderLayout.NORTH);
	}
}