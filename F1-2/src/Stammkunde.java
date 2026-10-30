
public class Stammkunde extends Kunde {

	private float rabatt;
	
	Stammkunde(String _Name, int _Alter, Mitarbeiter _kontakt, float _rabatt) {
		super(_Name, _Alter, _kontakt);
		setRabatt(_rabatt);
	}

	public float getRabatt() {
		return rabatt;
	}

	public void setRabatt(float rabatt) {
		this.rabatt = rabatt;
	}

	public void print()
	{
		
	}
}
