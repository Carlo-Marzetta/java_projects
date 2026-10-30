/*
 * JPanel on the game board that displays the last card that was placed
 * 
 * @version 1.0
 */


import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pile extends JPanel
{
	Card currentCard;
	Observable obs;
	
	Pile(Deck d)
	{
		obs = new Observable();
		obs.addObserver(d);
		setOpaque(false);
	}
	
	
	/*
	 * sets the current card on the pile and sends the card "below" to the deck
	 * @param the new card
	 */
	public void setCard(Card c)
	{
		obs.notifyObservers(currentCard);
		removeAll();
		currentCard = c;
		
		ImageIcon img = new ImageIcon("resources/cards/" + c.getC().toString() + c.getS().toString() + ".JPG");
		Image image = img.getImage();
		Image newImage = image.getScaledInstance(130, 200, Image.SCALE_SMOOTH);
		img = new ImageIcon(newImage);
		add(new JLabel(img));
		//add(currentCard);
		c.setObserver(null);
	}
	
	
	/*
	 * sets the first card of the game
	 * @param the card
	 */
	public void firstCard(Card c)
	{
		currentCard = c;
		c.setObserver(null);
		add(currentCard);
		System.out.println(currentCard.getC().toString() + currentCard.getS().toString());
	}
	
	
	/*
	 * checks if the incoming card can be placed
	 * @param the incoming card
	 * @return whether it can be placed or not
	 */
	public boolean checkCard(Card c)
	{
		if(c.getC() == currentCard.getC())
		{
			return true;
		}
		else if(c.getS() == currentCard.getS())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
 