
public class Zeitschrift extends PrintMedium
{
	private String ausgabeDatum;
	
	Zeitschrift(String titel, String verlag, String datum)
	{
		super(titel, verlag);
		ausgabeDatum = datum;
	}
	
	public void showInfo()
	{
		System.out.println(addTabulator2Text(titel) + addTabulator2Text(verlag) + addTabulator2Text("") + addTabulator2Text("") + addTabulator2Text(ausgabeDatum));
	}

}
