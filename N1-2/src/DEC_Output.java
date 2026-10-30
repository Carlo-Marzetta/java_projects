import java.util.Observable;


public class DEC_Output extends OutputView
{
	DEC_Output(Observable o)
	{
		super(o);
		setTitle("DEC");
	}
	
	public void update(Observable o, Object arg)
	{
		Integer i = Integer.valueOf(arg.toString(), 10);
		outValue.setText(i.toString());
		repaint();
	}
}
