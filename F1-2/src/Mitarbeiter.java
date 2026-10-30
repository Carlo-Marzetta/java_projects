
public class Mitarbeiter extends Person implements MitarbeiterIF
{

	private int persNr;
	private float lohn;
	private String telNr;
	
	
	Mitarbeiter(String _Name, int _Alter, int nr, String _telNr, float _lohn) {
		super(_Name, _Alter);
		lohn = _lohn;
		persNr = nr;
		telNr = _telNr;
	}


	public int getPersNr() {
		return persNr;
	}


	public void setPersNr(int persNr) {
		this.persNr = persNr;
	}


	public float getLohn() {
		return lohn;
	}


	public void setLohn(float lohn) {
		this.lohn = lohn;
	}


	public String getTelNr() {
		return telNr;
	}


	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
	
	
	public void print()
	{
		
	}
	
}
