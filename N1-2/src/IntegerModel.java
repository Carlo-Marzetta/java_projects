import java.util.Observable;

public class IntegerModel extends Observable
{
	private int value = 0;
	
	public IntegerModel()
	{
		
	}
	
	public void setValue(int v)
	{
		value = v;
		setChanged();
		notifyObservers(new Integer(v));
	}
}
