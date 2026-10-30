
public class AutorListe 
{
	public final int MAX_AUTOREN = 5;
	private Autor[] autoren;
	private int autorenCnt;
	
	
	AutorListe()
	{
		autoren = new Autor[MAX_AUTOREN];
	}
	
	public void addAutor(Autor autor)
	{
		for(int i = 0; i < MAX_AUTOREN; i++)
		{
			if (autoren[i] == null)
			{
				autoren[i] = autor;
				return;
			}
		}
	}
	
	public Autor getAutor(int index)
	{
		return autoren[index];
	}
	
	public void printOut()
	{
		System.out.println("Autoren-Liste\n-----------------------");
		for(Autor a: autoren)
		{
			if(a!=null)
			{
				System.out.println(a.getName());
			}
		}
	}
	
}
