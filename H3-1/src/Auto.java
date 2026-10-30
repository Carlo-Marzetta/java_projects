import java.util.*;


public class Auto implements Comparable<Auto>
{
	private String marke;
	private String kennzeichen;
	
	Auto(String _marke, String _kennzeichen)
	{
		kennzeichen = _kennzeichen;
		marke = _marke;
	}
	
	
	public String getMarke()
	{
		return marke;
	}
	
	public String getKennzeichen()
	{
		return kennzeichen;
	}


	public int compareTo(Auto a) 
	{
		return kennzeichen.compareTo(a.getKennzeichen());
	}	
}
