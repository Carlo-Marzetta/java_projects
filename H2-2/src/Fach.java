import java.util.*;


public class Fach implements Comparable<Fach>
{
	private String name;
	private String abkuerzung;
	private Vector<Note> noten;
	
	Fach(String _Name, String _Abkuerzung)
	{
		name = _Name;
		abkuerzung = _Abkuerzung;
		noten = new Vector<Note>();
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAbkuerzung()
	{
		return abkuerzung;
	}
	
	public float getNote(int index)
	{
		return noten.get(index).getNote();
	}
	
	public String getDatum(int index)
	{
		return noten.get(index).toString();
	}
	
	public float getSchnitt()
	{
		float _Schnitt = 0f;
		for(Note n : noten)
		{
			_Schnitt += n.getNote();
		}
		
		return _Schnitt / noten.size();
	}
	
	public int getAnzNoten()
	{
		return noten.size();
	}
	
	public void addNote(float _note, GregorianCalendar _datum)
	{
		Note n = new Note(_note, _datum);
		noten.add(n);
	}

	public void sortiereNachNotenwert()
	{
		noten.sort(new NotenWertVergleicher());
	}
	
	public void sortiereNachDatum()
	{
		noten.sort(new NotenDatumVergleicher());
	}
	
	public int compareTo(Fach other) 
	{
		return name.compareTo(other.getName());
	}
}
