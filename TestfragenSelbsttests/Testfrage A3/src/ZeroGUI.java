import javax.swing.*;
import java.awt.*;



public class ZeroGUI extends JFrame
{
	public static void main(String[] args)
	{
		new ZeroGUI();
	}
	
	
	ZeroGUI()
	{
		setTitle("Zero");
		setSize(300, 100);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel text = new JPanel();
		JLabel machtNichts = new JLabel("<html><style>p{color: red;}</style><p>Dieses Programm macht nichts!");
		JLabel copyright = new JLabel("Copyright(c) 1999");
		JLabel zerosoft = new JLabel("Zerosoft AG</p></html>");
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(1, 3, 0, 0));
		text.setLayout(new GridLayout(3, 1, 0, 0));
		JButton b1, b2, b3;
		b1 = new JButton("Abbruch");
		b2 = new JButton("OK");
		b3 = new JButton("Hilfe");
		
		
		text.add(machtNichts);
		text.add(copyright);
		text.add(zerosoft);
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		
		getContentPane().add(text, BorderLayout.NORTH);
		getContentPane().add(buttons, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
