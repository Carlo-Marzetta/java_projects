import java.util.Collections;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

public class DestinationModel extends DefaultComboBoxModel<String>
{
	private Vector<String> destinations;
	
	public DestinationModel()
	{
		destinations = new Vector<String>();
		
		destinations.add("Zürich");
		destinations.add("Berlin");
		destinations.add("Washington DC");
		destinations.add("Moskau");
		destinations.add("Konstantinopel");
		destinations.add("Istanbul");
		Collections.sort(destinations);
	}
	
	
	
	public String getElementAt(int index)
	{
		return destinations.get(index);
	}
	
	public int getSize()
	{
		return destinations.size();
	}
	
	public void addElement(String dest)
	{
		destinations.add(dest);
		fireIntervalAdded(this, 1, 0);
		Collections.sort(destinations);
	}
	
	@Override
	public String toString()
	{
		String returnVal = "Destinationen: ";
		for(String s : destinations)
		{
			returnVal += s + ", ";
		}
		System.out.println(returnVal);
		return returnVal;
	}	
}
