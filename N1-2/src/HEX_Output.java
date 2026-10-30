import java.util.Observable;

public class HEX_Output extends OutputView
{

	public HEX_Output(Observable o) 
	{
		super(o);
		setTitle("HEX");
	}
	
	public void update(Observable o, Object arg)
	{

		outValue.setText(Integer.toHexString(Integer.parseInt(arg.toString())));
		repaint();
	}

}
