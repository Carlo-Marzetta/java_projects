
public class Buch extends PrintMedium
{
	private String isbnNr;
	private Autor autor;
	
	Buch(String _titel, String _verlag, String _isbnNr, Autor _autor)
	{
		super(_titel, _verlag);
		isbnNr = _isbnNr;
		autor = _autor;
	}
	
	public String getIsbnNr()
	{
		return isbnNr;
	}
	
	public Autor getAutor()
	{
		return autor;
	}
	
	
	public void showInfo()
	{
		System.out.println(addTabulator2Text(titel) + addTabulator2Text(verlag) + addTabulator2Text(isbnNr) + addTabulator2Text(autor.getName()));
	}
}
