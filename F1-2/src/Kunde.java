
public class Kunde extends Person {

	MitarbeiterIF kontakt;

	Kunde(String _Name, int _Alter, MitarbeiterIF _kontakt) {
		super(_Name, _Alter);
		kontakt =   _kontakt;
	}
	
	
	public Mitarbeiter getKontakt()
	{
		return  (Mitarbeiter)kontakt;
	}
	
	public void setKontakt(MitarbeiterIF _kontakt)
	{
		kontakt =  _kontakt;
	}
	
	public void print()
	{
		
	}
	
	
	
	
	

}
