import java.util.*;
public class NotenListe 
{
	private List<Fach> m_Faecher;
	
	NotenListe()
	{
		m_Faecher = new Vector<Fach>();
	}
	
	public void addFach(String _Name, String _Abkuerzung)
	{
		Fach f = new Fach(_Name, _Abkuerzung);
		m_Faecher.add(f);
	}
	
	public void addNote(String _Fachname, float note, GregorianCalendar datum)
	{
		for(Fach f : m_Faecher)
		{
			if(f.getName() == _Fachname)
			{
				f.addNote(note, datum);
			}
		}
	}
	
	public void print()
	{
		for(Fach f : m_Faecher)
		{
			System.out.println(f.getName() + " " + f.getAbkuerzung() + ": Schnitt = " + f.getSchnitt());
			for(int i = 0; i < f.getAnzNoten(); i++)
			{
				System.out.println("	" + (i + 1) + ". Note: " + f.getNote(i) + " Datum: " + f.getDatum(i));
			}
			System.out.println("=========================================");
		}
		System.out.println("\n\n\n\n\n");
	}
	
	
	public void sortiereNachFach()
	{
		Collections.sort(m_Faecher);
	}
	
	public void sortiereNachWert()
	{
		for(Fach f : m_Faecher)
		{
			f.sortiereNachNotenwert();
		}
	}
	
	public void sortiereNachDatum()
	{
		for(Fach f : m_Faecher)
		{
			f.sortiereNachDatum();
		}
	}
}
