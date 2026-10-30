import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.*;

public class OpenAWebsite extends JFrame
{
	JPanel m_Buttons;
	JPanel m_Rest;
	JTextField m_Address;
	JButton m_Exit;
	JButton m_Search;
	JButton m_Help;
	
	
	public static void main(String[] args)
	{
		OpenAWebsite o = new OpenAWebsite();
	}
	
	OpenAWebsite()
	{
		super();
		setSize(600, 150);
		
		m_Buttons = new JPanel();
		m_Rest = new JPanel();
		m_Address = new JTextField("https://");
		m_Exit = new JButton("Exit");
		m_Search = new JButton("Search");
		m_Help = new JButton("Help!");
		
		
		
		//LAYOUT SETTING
		getContentPane().setLayout(new BorderLayout(20, 20));
		m_Buttons.setLayout(new GridLayout(1, 3, 20, 20));
		m_Rest.setLayout(new BorderLayout(20, 20));
		
		
		
		//ADDING
		m_Rest.add(m_Address, BorderLayout.NORTH);
		m_Buttons.add(m_Search);
		m_Buttons.add(m_Exit);
		m_Buttons.add(m_Help);
		getContentPane().add(m_Rest, BorderLayout.CENTER);
		getContentPane().add(m_Buttons, BorderLayout.SOUTH);
		
		//LISTENER ADDING
		m_Search.addActionListener(new KeyListener());
		m_Exit.addActionListener(new KeyListener());
		m_Help.addActionListener(new KeyListener());
		
		
		
		setVisible(true);
	}
	
	
	void searchForWebsite()
	{
		URI _URI;
		try 
		{
			_URI = new URI(m_Address.getText());
			Desktop.getDesktop().browse(_URI);
		}
		
		catch (URISyntaxException e1) 
		{
			e1.printStackTrace();
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public class KeyListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e) 
		{
			String s = e.getActionCommand();
			switch(s)
			{
				case "Help!":
					HelpPage p = new HelpPage();
					break;
					
				case "Search":
					searchForWebsite();
					break;
					
				case "Exit":
					System.exit(0);
					break;
			
			}
		}
	}

}
