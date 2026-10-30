/*
 * a card in the game
 * 
 * @version 1.0
 */


import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import javax.swing.JPanel;

public class Deck implements Observer {
	JPanel m_Content;
	Vector<Card> m_Cards;
	CardObserver m_CO;
	CardManager m_CM;
	CardReciever m_CR;

	Deck(Vector<Card> cards, CardManager cm) 
	{
		m_Content = new JPanel();
		m_CM = cm;
		m_Content.setOpaque(false);
		m_CO = new CardObserver() 
		{

			@Override
			public void onCard(Card c) 
			{
				cardPicked(c);
			}

		};
		m_Cards = cards;

		for (Card c : m_Cards)
		{
			c.setObserver(m_CO);
		}

		Collections.shuffle(m_Cards);

		m_Cards.get(0).turnCard();
		m_Content.add(m_Cards.get(0));
	}

	
	/*
	 * Recieves the card from the pile
	 * 
	 * @param the pile from where the card is coming from, the card
	 */
	public void update(Observable o, Object cardFromPile) 
	{
		Card c = (Card) cardFromPile;
		c.setObserver(m_CO);
		c.showFront(false);
		System.out.println("Card from Pile:" + c.getC().toString() + c.getS().toString());
		Collections.shuffle(m_Cards);
		m_Cards.add((Card) cardFromPile);
	}

	
	/*
	 * returns the content of the deck
	 * @return the content
	 */
	public JPanel getPanel() 
	{
		return m_Content;
	}

	
	/*
	 * sets the card reciever
	 * @param the card reciever
	 */
	public void setReciever(CardReciever cr) 
	{
		m_CR = cr;
	}

	/*
	 * returns a random card from the deck
	 * 
	 * @return a random card
	 * 
	 */
	public Card getRdmCard()
	{
		Card c = m_Cards.get(1);
		m_Cards.remove(c);
		return c;
	}

	
	/*
	 * gives a card to the current player
	 * 
	 * @param the card that has been clicked
	 */
	public void cardPicked(Card card) 
	{
		if (m_CR.canReceiveCard()) 
		{
			card.showFront(true);
			m_Content.remove(card);
			m_CR.recieveCard(card);
			m_Cards.remove(card);
			System.out.println("Card should have been removed");

			if (m_Cards.size() > 0) 
			{
				m_Cards.get(0).showFront(false);
				m_Content.add(m_Cards.get(0));
			} 
			else 
			{
				Instructions.print("There are no more Cards in this Deck");
			}
		}
	}
}