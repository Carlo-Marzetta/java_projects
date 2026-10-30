

public class Klasse 
{
	private String klassenname;
	private Lehrperson lehrperson;
	private Lernende[] alleLernende;
	
	private final int MAXSIZE = 5;
	
	private int cntr;

	
	
	
	Klasse(String _Name)
	{
		klassenname = _Name;
		alleLernende = new Lernende[MAXSIZE];
	}
	
	
	public String getLehrperson() {
		return lehrperson.GetName();
	}

	public void setLehrperson(Lehrperson lp) {
		lehrperson = lp;
	}
	
	public void addLernende(Lernende lernende)
	{
		for (int i = 0; i< MAXSIZE; i++)
		{
			if (alleLernende[i] == null)
			{
				alleLernende[i] = lernende;
				cntr++;
				return;
			}
		}
	}


	public String getKlassenname() 
	{
		return klassenname;
	}
	
	public int getAnzahlLernende()
	{

		return cntr;
		
	}
	
	public String getNameLernende(int index)
	{
		if(alleLernende[index] != null)
		{
			return alleLernende[index].getName();
		}
		else
		{
			return "Lernende Index Ungültig";
		}
		
	}
	
	
	public int getGeburtsjahrLernende(int index)
	{
		if(alleLernende[index] != null)
		{
			return alleLernende[index].getGeburtsjahr();
		}
		else
		{
			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
}
