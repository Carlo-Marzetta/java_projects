/*
 * Manages the cards and card-related objects
 * 
 * @version 1.0
 */


import java.awt.GraphicsEnvironment;
import java.util.Collections;
import java.util.Vector;

public class CardManager 
{
	Vector<Card>m_Cards;
	Deck m_Deck;
	Pile m_Pile;
	
	CardManager()
	{		
		
	m_Cards = new Vector<Card>();
	
	for(CardSymbol cs : CardSymbol.values())
	{
		for(CardColor cc : CardColor.values())
			{
				m_Cards.add(new Card(cc, cs));	
				if(!cs.equals(CardSymbol.ZERO))
				{
					m_Cards.add(new Card(cc, cs));
				}
			}
	}
	
		m_Deck = new Deck(m_Cards, this);
		m_Pile = new Pile(m_Deck);
		
		m_Pile.firstCard(m_Deck.getRdmCard());

	}
	

	public Deck getDeck()
	{
		return m_Deck;
	}
	
	public void setPMObserver(CardReciever cr)
	{
		m_Deck.setReciever(cr);
	}
	
	public Card requestCard()
	{
		return m_Deck.getRdmCard();
	}

	
	public Vector<Card> getCards()
	{
		return m_Cards;
	}
	
	public Pile getPile()
	{
		return m_Pile;
	}
	
	public void killAll()
	{
		m_Deck = null;
		m_Pile = null;
		for(Card c : m_Cards)
		{
			c = null;
		}
	}
	
}
