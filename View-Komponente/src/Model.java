import java.util.Collections;
import java.util.Observable;
import java.util.Vector;

import javax.swing.DefaultListModel;

public class Model extends DefaultListModel
{
	private Vector<String> data;
	
	public Model()
	{
		data = new Vector<String>();
	    data.add("Skifahren");
	    data.add("Schwimmen");
	    data.add("Fussball");
	    data.add("Segeln");
	    data.add("Cart Rennen");
	    data.add("Volleyball");
	    data.add("Biken");
	    Collections.sort(data);
	}
	
	public String getElementAt(int index)
	{
		return data.get(index);
	}
	
	public int getSize()
	{
		return data.size();
	}
	
	public void addElement(String value)
	{
		data.add(value);
		Collections.sort(data);
		fireIntervalAdded(this, data.size(), data.size());
	}
}
