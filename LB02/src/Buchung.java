
public class Buchung 
{
	private float betrag;
	private int datum;
	
	
	Buchung(float betrag)
	{
		this.betrag = betrag;
	}
	
	public float getBetrag()
	{
		return betrag;
	}
	
	public int getDatum()
	{
		return datum;
	}
	
	public void setDatum(int datum)
	{
		this.datum = datum;
	}
}
