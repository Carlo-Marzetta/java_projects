import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MarcsTest extends JFrame
{
	JRadioButton rb;
	JLabel verz;
	JTextField txt;
	JButton go;
	
	
	public static void main(String[] args)
	{
		new MarcsTest();
	}
	
	MarcsTest()
	{
		rb = new JRadioButton("upload", true);
		verz = new JLabel("Verzeichnis");
		txt = new JTextField();
		go = new JButton("GO");
		
		
		txt.setSize(300, HEIGHT);
		setLayout(new FlowLayout());
		
		add(rb);
		add(verz);
		add(txt);
		add(go);
		
		
		setSize(400, 200);
		setVisible(true);
	}
	
	
	
	
	public class ButtonsListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}

	}
}
