
public class Lehrperson {

	private String nachname;
	private String vorname;
	
	
	Lehrperson(String _Nachname, String _Vorname)
	{
		nachname = _Nachname;
		vorname = _Vorname;
	}
	
	public String GetName()
	{
		return nachname + vorname;
	}
	
}
