
public class Person 
{
	
	String name;
	int alter;
	String adresse;
	
	Person(String _Name, int _Alter)
	{
		name = _Name;
		alter = _Alter;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAlter()
	{
		return alter;
	}
	
	public String getAdresse()
	{
		return adresse;
	}
	
	public void setAdresse(String _Adresse)
	{
		adresse = _Adresse;
	}
	
	public void print()
	{
		
	}
	
}
