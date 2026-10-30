
public class Lernende {
	
	private String nachname;
	private String vorname;
	private int geburtsjahr;
	
	
	
	Lernende(String _Nachname, String _Vorname, int _Geburtsjahr)
	{
		nachname = _Nachname;
		vorname = _Vorname;
		geburtsjahr = _Geburtsjahr;
	}
	
	
	public String getName()
	{
		return nachname + vorname;
	}
	
	public int getGeburtsjahr()
	{
		return geburtsjahr;
	}

}
