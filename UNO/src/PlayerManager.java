/*
 * Manages the players and the procedure of the game
 * 
 * @version 1.0
 */


import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class PlayerManager
{

	private Vector<Player> m_Players;
	Player currentPlayer;
	PlayerListener m_PL = new PlayerListener()
			{
				public void nextPlayer()
				{
					if(m_Players.indexOf(currentPlayer) ==( m_Players.size()-1))
					{
						currentPlayer = m_Players.get(0);
					}
					else
					{
						currentPlayer = m_Players.get(m_Players.indexOf(currentPlayer) + 1);
					}
					
					playersTurn();
				}
			};
			
			
			
	CardReciever m_Reciever = new CardReciever() {

		@Override
		public void recieveCard(Card c) 
		{
			currentPlayer.addCard(c);
			Instructions.print(currentPlayer.getName() + " picked a card.");
			boolean pass = true;
			for(Card card : currentPlayer.getAllCards())
			{
				if(currentPlayer.getPile().checkCard(card))
				{
					pass = false;
				}
			}
			if(pass)
			{
				
				m_PL.nextPlayer();
				playersTurn();
			}
		}

		@Override
		public boolean canReceiveCard() 
		{
			return currentPlayer.canPickUp();
		}
	};
	
	
	CardManager m_CM;
	

	PlayerManager(String[] playerNames, CardManager cm, WinListener wl)
	{
		m_CM = cm;
		m_CM.setPMObserver(m_Reciever);
		m_Players = new Vector<Player>();
		
		for(int i = 0; i < 4; i++)
		{
			m_Players.add(new Player(playerNames[i], i, cm.getPile(), wl));
			currentPlayer = m_Players.get(i);
			currentPlayer.setListener(m_PL);
			giveCardsToPlayer(3);
		}
		currentPlayer = m_Players.get(0);

		playersTurn();
	}
	/*
	 * returns the player at a certain position
	 * @return the player
	 */
	public Player getPlayer(int key)
	{
		return m_Players.get(key);
	}
	
	
	/*
	 * returns all the player's cards in a vector
	 * @return card vector
	 */
	public Vector<Card> getAllCards()
	{
		Vector<Card> cards = new Vector<Card>();
		for(Player p : m_Players)
		{
			for(Card c : p.getAllCards())
			{
				cards.add(c);
			}
		}
		
		return cards;
	}
	
	
	/*
	 * gives a certain amount of cards to the current player
	 * @param the amount of cards
	 */
	public void giveCardsToPlayer(int cards)
	{
		for(int i = 0; i<cards; i++)
		{
			currentPlayer.addInitialCards(m_CM.requestCard());
		}
	}
	
	
	/*
	 * returs the player at a certain index
	 * @return the player
	 */
	public int getPlayerIndex(Player p)
	{
		return m_Players.indexOf(p);
	}
	
	void playersTurn()
	{
		for(Player p : m_Players)
		{
			p.setActive(false);
		}
		Instructions.print("It's " + currentPlayer.getName() + "'s turn.");
		currentPlayer.setActive(true);
	}

	
	/*
	 * deletes all the players
	 */
	public void killAll() 
	{
		for(Player p : m_Players)
		{
			p = null;
		}
	}
}
