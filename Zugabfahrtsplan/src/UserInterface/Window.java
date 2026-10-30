package UserInterface;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame
{
	JPanel m_ContentPane;
	public Window()
	{
		graphicsSetup();
	}

	private void graphicsSetup()
	{	
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Java Workspace\\Zugabfahrtsplan\\src\\UserInterface\\img\\icon.png");   
		setIconImage(icon);
		setLayout(new BorderLayout(5, 5));
		
		
		setSize(1280, 720);
		setResizable(true);
		
		m_ContentPane = new JPanel();
		m_ContentPane.setLayout(new BorderLayout());
		
		add(new Header(), BorderLayout.NORTH);
		
		setVisible(true);
	}
}
