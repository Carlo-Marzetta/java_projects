/*
 * JPanel on the game board that displays the cards that the player has and his name
 * 
 * @version 1.0
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Player extends JPanel
{
	String m_Name;
	Vector<Card> m_Cards;
	JLayeredPane m_UICards;
	JPanel m_FirstCard;
	PlayerListener m_PL;
	int m_Score;
	WinListener m_WL;
	boolean m_IsTurn;
	boolean m_CanPickUp;
	int iD;
	Pile m_Pile;
	
	
	CardObserver m_CO = new CardObserver() {
		
		@Override
		public void onCard(Card c) 
		{
			if(m_IsTurn)
			{
				if(m_Pile.checkCard(c))
				{
					m_Cards.remove(c);
					c.setObserver(null);
					m_Pile.setCard(c);
					
					if(m_Cards.size() == 0)
					{
						m_WL.iWon(Player.this);
					}
					else
					{
						rearrange();
					}
					m_PL.nextPlayer();
				}
				else
				{
					Instructions.print("Invalid Card");
				}
			}
			else
			{
				Instructions.print("Please wait for your turn you wanker");
			}
		}
	};
	
	
	Player(String name, int id, Pile p, WinListener wl)
	{
		m_Name = name;
		m_Cards = new Vector<Card>();
		setOpaque(false);
		m_WL = wl;
		m_Pile = p;
		iD = id;
		
		m_UICards = new JLayeredPane();
		m_UICards.setBackground(Color.red);
		m_UICards.setOpaque(false);
		setLayout(new BorderLayout(5, 5));
		JPanel bottom = new JPanel();
		bottom.setOpaque(false);
		bottom.setLayout(new GridLayout(1, 2, 5, 5));
		JLabel nL = new JLabel(m_Name);
		nL.setFont(nL.getFont().deriveFont(20f));
		nL.setOpaque(false);
		bottom.add(nL);
		add(bottom, BorderLayout.NORTH);
		add(m_UICards, BorderLayout.CENTER);
	}
	
	
	/*
	 * Puts an additional card in the player's posession
	 * @param the added card
	 */
	public void addCard(Card c)
	{
		m_CanPickUp = false;
		m_Cards.add(c);
		rearrange();
		c.setObserver(m_CO);
	}
	
	
	/*
	 * gives the player an initial card
	 * @param the added card
	 */
	public void addInitialCards(Card c)
	{
		m_Cards.add(c);
		rearrange();
		c.setObserver(m_CO);
	}
	
	
	/*
	 * sets the player's score
	 * @param the score
	 */
	public void setScore(int i)
	{
		m_Score += i;
	}
	
	
	/*
	 * returns the player's score
	 * @return the score
	 */
	public int getScore()
	{
		return m_Score;
	}
	
	void rearrange()
	{
		Point origin = new Point(0, 0);
		int increment = 371/m_Cards.size();
		m_UICards.removeAll();
		for(int i = 0; i < m_Cards.size(); i++)
		{
			m_Cards.get(i).setBounds(origin.x, origin.y, 130, 200);
			m_UICards.add(m_Cards.get(i), new Integer(i));
			origin.x += increment;
		}
		
		revalidate();
		repaint();
	}
	
	/*
	 * Tells the player whether its his turn or not
	 * @param if it's his turn
	 */
	public void setActive(boolean tf)
	{
		m_IsTurn = tf;
		if(tf)
		{
			setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
			m_CanPickUp = true;
		}
		else 
		{
			setBorder(BorderFactory.createEmptyBorder());
		}
	}
	
	/*
	 * Sets the player Listener
	 * @param the listener
	 */
	public void setListener(PlayerListener pl)
	{
		m_PL = pl;
	}
	
	public Vector<Card> getAllCards()
	{
		return m_Cards;
	}

	
	/*
	 * returns the pile
	 * @return the pile
	 */
	public Pile getPile()
	{
		return m_Pile;
	}
	
	/*
	 * returns the player's name
	 * @return the name
	 */
	@Override
	public String getName()
	{
		return m_Name;
	}



	/*
	 * returns whether the player can pick up a card or not
	 * @return if the player can pick up a card
	 */
	public boolean canPickUp() {
		return m_CanPickUp;
		
	}
}

