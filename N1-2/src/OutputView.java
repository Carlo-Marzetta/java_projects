import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class OutputView extends JFrame implements Observer
{
	JLabel outValue;
	int xPos = 50;
	int yPos = 50;
	int xDelta = 100;
	int yDelta = 75;
	
	public OutputView(Observable o)
	{
		o.addObserver(this);
		outValue = new JLabel("Zahl");
		add(outValue);
		setLocation(rndmNumberGenerator() * 2, rndmNumberGenerator());
		setSize(300, 75);
		setVisible(true);
	}
	
	private void init()
	{
		
	}
	
	private int rndmNumberGenerator()
	{
		return (int)(Math.random() * 1000 + 1);
	}
}
