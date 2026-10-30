import java.util.*;

public class AutoListe //implements Comparator<Auto>
{
	
	private Vector<Auto> alleAutos;
	
	
	AutoListe()
	{
		alleAutos = new Vector();
	}
	
	public String getKennzeichen(int index)
	{
		return alleAutos.get(index).getKennzeichen();
	}
	
	public String getMarke(int index)
	{
		return alleAutos.get(index).getMarke();
	}
	
	public void addAuto(Auto auto)
	{
		alleAutos.add(auto);
	}
	
	public Auto getAuto(int index)
	{
		return alleAutos.get(index);
	}
	
	public void removeAuto(int index)
	{
		alleAutos.remove(index);
	}
	
	public void removeAuto(Auto auto)
	{
		alleAutos.remove(auto);
	}
	
	public int getSize()
	{
		return alleAutos.size();
	}
	
	public void printListe()
	{
		for(Auto a : alleAutos)
		{
			System.out.println("Auto: " + a.getKennzeichen() + " - " + a.getMarke());
		}
		
		ListIterator it = alleAutos.listIterator();
		
		System.out.println("===========================================================");
		
		while(it.hasNext())
		{ 
			Object a = it.next();
			Auto b = Auto.class.cast(a);
			System.out.println("Auto: " + b.getKennzeichen() + " - " + b.getMarke());
		}
		
		System.out.println("===========================================================");
	}
	
	public void sortiereAuto()
	{
		//alleAutos.sort(new SortByNum());
		//alleAutos.sort(new AutoListe());
		Collections.sort(alleAutos);
	}
	
	/*public int compare(Auto a1, Auto a2)
	{
		return a1.getKennzeichen().compareTo(a2.getKennzeichen());
	}**/
}
