import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.*;


public class JavaPhoneGUI extends JFrame 
{
	JPanel m_KeyPanel;
	JPanel m_HookStatePanel;
	JPanel m_KeyDisplayPanel;
	
	JButton m_Key1, m_Key2, m_Key3;
	JButton[] m_Numbers;
	JButton m_HookStateButton;
	URL myUrl;
	JLabel m_State;
	JTextField m_Display;
	
	boolean connected = false;
	
	JavaPhoneGUI()
	{
		super();
		
		//INITIALIZING
		setSize(350, 400);
		m_Numbers = new JButton[10];
		
		m_KeyPanel = new JPanel();
		m_Key1 = new JButton("*");
		m_Key2 = new JButton("0");
		m_Key3 = new JButton("#");
		
		
		m_HookStatePanel = new JPanel();
		m_HookStateButton = new JButton("Hook off");
		m_State = new JLabel("<html><head><style>p{color: green}</style></head><p>ready</p></html>");
		m_Display = new JTextField();
		m_KeyDisplayPanel = new JPanel();
		//END INITIALIZING
		
		
		//FRAME SETTING
		setLayout(new BorderLayout(20, 20));
		setTitle("JPhone");
		getContentPane().setLayout(new BorderLayout(20, 20));
		
		
		//LAYOUT SETTING
		m_KeyPanel.setLayout(new GridLayout(4, 3, 20, 20));
		m_KeyDisplayPanel.setLayout(new BorderLayout(20, 20));
		m_HookStatePanel.setLayout(new BorderLayout(20, 20));
		
		//KEY ADDING
		for(Integer i = 1; i < 10; i++)
		{
			m_Numbers[i] = new JButton(i.toString());
			m_KeyPanel.add(m_Numbers[i]);
			m_Numbers[i].addActionListener(new KeyListener());
		}
		m_Key1.addActionListener(new KeyListener());
		m_Key2.addActionListener(new KeyListener());
		m_Key3.addActionListener(new KeyListener());
		
		
		m_KeyPanel.add(m_Key1);
		m_KeyPanel.add(m_Key2);
		m_KeyPanel.add(m_Key3);
		//END KEY ADDING
		
		
		//MORE ADDING
		m_HookStatePanel.add(m_State, BorderLayout.NORTH);
		m_HookStatePanel.add(m_HookStateButton, BorderLayout.CENTER);
		m_KeyDisplayPanel.add(m_Display, BorderLayout.NORTH);
		m_KeyDisplayPanel.add(m_KeyPanel, BorderLayout.CENTER);
		getContentPane().add(m_KeyDisplayPanel, BorderLayout.CENTER);
		getContentPane().add(m_HookStatePanel, BorderLayout.WEST);
		
		m_HookStateButton.addActionListener(new HookListener());
		
		setVisible(true);
	
	}
	
	
	
	
	public class KeyListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e) 
		{
			String s = e.getActionCommand();
			m_Display.setText(m_Display.getText() + s);
		}
	}
	
	public class HookListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(connected == false)
			{
				m_HookStateButton.setText("Hook on");
				m_State.setText("<html><head><style>p{color: green}</style></head><p>connected</p></html>");
				connected = true;
			}
			else
			{
				m_HookStateButton.setText("Hook off");
				m_State.setText("<html><head><style>p{color: green}</style></head><p>ready</p></html>");
				connected = false;
			}
		}
	}

}
