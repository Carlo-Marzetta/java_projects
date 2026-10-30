/*
 * a card in the game
 * 
 * @version 1.0
 */



import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JButton
{
	CardObserver m_Observer;
	ImageIcon img;
	ImageIcon front;
	ImageIcon back;
	boolean isTurned = false;
	CardColor cc;
	CardSymbol cs;
	Card thiscard;
	
	Card(CardColor c, CardSymbol s)
	{
		cc = c;
		cs = s;
		thiscard = this;
		setOpaque(false);
		setBorder(BorderFactory.createEmptyBorder());
		
		//Resizing
		img = new ImageIcon("resources/cards/" + c.toString() + s.toString() + ".JPG");
		Image image = img.getImage();
		Image newImage = image.getScaledInstance(130, 200, Image.SCALE_SMOOTH);
		front = new ImageIcon(newImage);
		
		back = new ImageIcon("resources/cards/BACK.PNG");
		Image backImage = back.getImage();
		Image newBack = backImage.getScaledInstance(130, 200, Image.SCALE_SMOOTH);
		back = new ImageIcon(newBack);
		
		
		
		add(new JLabel(front));
		addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						System.out.println(getC().toString() + " " + getS().toString());
						try
						{
							m_Observer.onCard(thiscard);
						}
						catch(NullPointerException e)
						{
							Instructions.print("You cannot use this card.");
						}
						
						
					}
				});
	}
	
	
	/*
	 * Returns the CardColor of the Card
	 * 
	 * @return the Color of the Card
	 */
	public CardColor getC()
	{
		return cc;
	}
	
	
	
	/*
	 * Returns the CardSymbol of the Card
	 * 
	 * @return the Symbol of the Card
	 */
	public CardSymbol getS()
	{
		return cs;
	}


	
	/*
	 * sets the Observer of the Card
	 */
	public void setObserver(CardObserver ob)
	{
		m_Observer = ob;
		repaint();
	}
	
	
	/*
	 * This method changes the icon of the Card so that it can be "turned"
	 */
	public void turnCard()
	{
		if(isTurned)
		{
			removeAll();
			add(new JLabel(front));
			isTurned = false;
		}
		else
		{
			removeAll();
			add(new JLabel(back));
			isTurned = true;
		}
	}
	
	
	/*
	 * This method turns the card to the given side
	 * @param The side the card has to show
	 */
	public void showFront(boolean turn)
	{
		if(turn)
		{
			removeAll();
			add(new JLabel(front));
		}
		else
		{
			removeAll();
			add(new JLabel(back));
		}
		
		revalidate();
		repaint();
	}
}
