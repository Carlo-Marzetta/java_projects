import java.util.Observable;

public class BIN_Output extends OutputView
{
	
	BIN_Output(Observable o)
	{
		super(o);
		setTitle("BIN");
	}
	
	public void update(Observable o, Object arg)
	{
		outValue.setText(Integer.toBinaryString(Integer.parseInt(arg.toString())));
		repaint();
	}	
}
