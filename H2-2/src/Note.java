import java.util.*;
public class Note 
{
	private float note;
	private GregorianCalendar datum;
	
	
	Note(float _Note, GregorianCalendar _Datum)
	{
		datum = _Datum;
		note = _Note;
	}
	
	public float getNote()
	{
		return note;
	}
	
	public String toString()
	{
		String dt = "";
		dt += datum.get(Calendar.DAY_OF_MONTH);
		dt += "." + datum.get(Calendar.MONTH);
		dt += "." + datum.get(Calendar.YEAR);
		return dt;
	}
	
	public GregorianCalendar getDatum()
	{
		return datum;
	}
}
