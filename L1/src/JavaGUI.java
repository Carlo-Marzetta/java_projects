import javax.swing.*;
import java.awt.*;


public class JavaGUI extends JFrame
{
	JButton aButton;
	
	public static void main(String[] args)
	{
		JavaGUI j = new JavaGUI();
	}
	
	JavaGUI()
	{
		super("Fenster");
		
		aButton = new JButton("Knopf");
		add(aButton);
		pack();
		setVisible(true);
	}
}
