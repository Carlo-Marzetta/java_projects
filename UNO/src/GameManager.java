/*
 * manages the different stages of the application
 * 
 * @version 1.0
 */



import java.awt.BorderLayout;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class GameManager extends JFrame
{
	private PlayerManager m_PM;
	private CardManager m_CM;
	
	private MainMenu m_MainMenu;
	private PlayerNaming m_PlayerNaming;
	private JPanel m_PauseMenu;
	private RoundWon m_RoundWon;
	private GameBoard m_GameBoard;
	private WinScreen m_VictoryScreen;
	private Clip clip;
	boolean m_IsON = false;
	
	private int[] m_Scores;
	private String[] m_Names;
	
	
	WinListener m_WL = new WinListener() {
		
		@Override
		public void iWon(Player p)
		{
			roundWon(p);
		}
	};
	
	
	/*
	 * 
	 * 
	 */
	GameManager()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		musicSetup();
		graphicsSetup();
	}
	
	
	
	/*
	 * starts the music
	 */
	private void musicSetup() {
		AudioInputStream audioIn;
		InputStream in;
		try {
			in = (InputStream)new BufferedInputStream(new FileInputStream(new File("resources/music/elevator.wav")));
			audioIn = AudioSystem.getAudioInputStream(in);
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
			m_IsON = true;
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	/*
	 * switches the music on or off depending on if it is
	 */
	public void turnMusic()
	{
		if(m_IsON)
		{
			clip.stop();
			m_IsON = false;
		}
		else
		{
			clip.start();
			m_IsON = true;
		}
	}
	
	/*
	 * turns the music to the given state
	 * 
	 * @param turn it on or off
	 */
	public void turnMusic(boolean onoff)
	{
		if(!onoff)
		{
			clip.stop();
			m_IsON = false;
		}
		else
		{
			clip.start();
			m_IsON = true;
		}
	}


	
	/*
	 * sets up the graphics
	 */
	private void graphicsSetup()
	{
		setupMainMenu();
		setupPlayerNaming();
		
		mainMenu();
		
		
		setSize(1280, 720);
		setResizable(false);
		setVisible(true);
	}
	
	
	/*
	 * sets up the main menu
	 */
	void setupMainMenu()
	{
		setLayout(new BorderLayout(0,0));
		try
		{
		m_MainMenu = new MainMenu("resources/UI/MainMenuBackground.PNG", this);
		}
		catch(IOException e)
		{
			System.out.println("Background image couldn't be found.");
		}
		m_Scores = new int[] {0, 0, 0, 0};
		add(m_MainMenu, BorderLayout.CENTER);
	}

	void setupPlayerNaming()
	{
		m_PlayerNaming = new PlayerNaming(this, "resources/UI/PlayerNamingBackground.PNG");
	}
	
	/*
	 * goes to the main menu screen
	 */
	public void mainMenu()
	{

		turnMusic(true);
		try
		{
			this.remove(m_PlayerNaming);
		}
		catch(NullPointerException e)
		{
			
		}
		
		m_MainMenu.setVisible(true);
		add(m_MainMenu);
		revalidate();
		repaint();
	}
	
	/*
	 * goes to player naming screen
	 */
	public void playerNaming()
	{
		m_MainMenu.setVisible(false);
		remove(m_MainMenu);
		add(m_PlayerNaming);
	}
	
	
	/*
	 * starts a round
	 */
	public void game()
	{

		m_PlayerNaming.setVisible(false);
		
		if(m_GameBoard != null)
		{
			m_GameBoard.killAll();
			m_GameBoard.setVisible(false);
			remove(m_GameBoard);
			m_PM.killAll();
			m_CM.killAll();
		}
		m_Names = m_PlayerNaming.getNames();
		m_CM = new CardManager();
		m_PM = new PlayerManager(m_PlayerNaming.getNames(), m_CM, m_WL);
		Management m = new Management(this);

		
		m_GameBoard = new GameBoard(new Scoreboard(m_PlayerNaming.getNames(), m_Scores), m, m_CM.getPile(), new Instructions(), m_CM.getDeck(),  m_PM.getPlayer(0), m_PM.getPlayer(1), m_PM.getPlayer(2), m_PM.getPlayer(3));
		System.out.println("it got here");
		add(m_GameBoard);
		
		revalidate();
		repaint();
		
	}
	
	
	/*
	 * manages the game when a player has won a round
	 */
	public void roundWon(Player p)
	{
		m_Scores[m_PM.getPlayerIndex(p)] += getRoundScore();

		
		boolean gameOver = false;
		for(int i : m_Scores)
		{
			if(i >= 500)
			{
				gameOver = true;
				break;
			}
		}
		
		if(!gameOver)
		{
			game();
			m_RoundWon = new RoundWon(this);
			System.out.println("The round has been won");
			m_RoundWon.setWinner(p, getRoundScore());
		}
		else
		{
			sortPlayers(m_Scores);
			m_VictoryScreen = new WinScreen(this, m_Names, m_Scores);
		}
	}
	
	
	/*
	 * returns the score the round winner gets by calculating the card symbols
	 * @return score increment
	 */
	public int getRoundScore()
	{
		Vector<Card> allCards = m_PM.getAllCards();
		int score = 0;
		for(Card c : allCards)
		{
			switch(c.getS())
			{
				case UNO:
					score ++;
					break;
				case TWO:
					score += 2;
					break;
				case THREE:
					score += 3;
					break;
				case FOUR:
					score += 4;
					break;
				case FIVE:
					score += 5;
					break;
				case SIX:
					score += 6;
					break;
				case SEVEN:
					score += 7;
					break;
				case EIGHT:
					score += 8;
					break;
				case NINE:
					score += 9;
					break;
			}
		}
		return score;
	}
	
	
	/*
	 * returns a player at a certain position
	 * @param the position
	 * @return the player at that position
	 */
	public Player getPlayer(int i)
	{
		return m_PM.getPlayer(i);
	}
	
	
	/*
	 * returns the score at a certain position
	 * @param the position
	 * @return the score at that position
	 */
	public int getScore(int i)
	{
		return m_Scores[i];
	}
	
	
	/*
	 * returns the winner of the game
	 * 
	 * @return the game winner
	 */
	public Player getWinner()
	{
		int winnerI = 0; 
		int maxScore = 0;
		for(int i = 0; i < 4; i++)
		{
			if(m_Scores[i] > maxScore)
			{
				winnerI = i;
				maxScore = m_Scores[i];
			}
		}
		
		return m_PM.getPlayer(winnerI);
	}
	
	
	/*
	 * sorts the players and scores by the score of each player
	 * @param the scores
	 */
	public void sortPlayers(int[] _list)
	{
		int[] _newList = m_Scores;
		String[] oldPlayerNames = m_Names;
		String[] sortedPlayerNames = m_Names;
		
		for(int i = 0; i < _list.length; i++)
		{
			for(int j = i; j < _list.length; j++)
			{
				if(_list[j] < _newList[i])
				{
					int temp = _newList[i];
					String tmp = sortedPlayerNames[i];
					
					_newList[i] = _list[j];
					sortedPlayerNames[i] = oldPlayerNames[j];
					
					oldPlayerNames[j] = tmp;
					_list[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(_newList[i]  + sortedPlayerNames[i]);
		}
		
		m_Scores = _newList;
		m_Names = sortedPlayerNames;
	}


	
	/*
	 * exits the game
	 */
	public void rip() {
		System.exit(0);
		
	}


	/*
	 * starts a new game
	 */
	public void revanche(WinScreen ws) {
		ws.dispose();
		m_Scores = new int[] {0, 0, 0, 0};
		game();
		
	}	
	
}
