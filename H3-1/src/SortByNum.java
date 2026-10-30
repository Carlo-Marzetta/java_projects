import java.util.Comparator;

public class SortByNum implements Comparator<Auto>
{

	public int compare(Auto a, Auto b) 
	{
		return a.getKennzeichen().compareTo(b.getKennzeichen());
	}
}