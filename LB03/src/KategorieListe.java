
public class KategorieListe 
{
	
	private Kategorie[] alleKategorien;
	private final int MAX_KATEGORIEN = 10;
	private int kategorienCounter = 0;
	
	
	
	public static void main(String[] args)
	{

	}
	
	
	
	KategorieListe()
	{
		alleKategorien = new Kategorie[MAX_KATEGORIEN];
	}
	
	public boolean addKategorie(Kategorie kategorie)
	{
		for (int i = 0; i < alleKategorien.length; i++)
		{
			if(alleKategorien[i] == null)
			{
				alleKategorien[i] = kategorie;
				kategorienCounter = i;
				return true;
			}
		}
		return false;
	}
	
	public int getAnzahlalleKategorien()
	{
		for(int i = 0; i < Integer.MAX_VALUE; i++)
		{
			if(alleKategorien[i] == null)
			{
				return i;
			}
		}
		
		return 0;
	}
	
	public Kategorie getKategorie(int index)
	{
		return alleKategorien[index];
	}
	
	public static void kategorieErfassen(KategorieListe liste, String name, int anzSpieler)
	{
		Kategorie k;
		k = new Kategorie(name, anzSpieler);
		
		
		for (int i = 0; i < liste.alleKategorien.length; i++)
		{
			if(liste.alleKategorien[i] == null)
			{
				liste.alleKategorien[i] = k;
				return;
			}
		}
	}
	
	

	
	public void printListe()
	{
		for(Kategorie k: alleKategorien)
		{
			if(k != null)
			{
				System.out.println(k.getBezeichnung());
			}
		}
	}
	
	public void removeKategorie(Kategorie kategorie)
	{
		Kategorie[] copyArray = new Kategorie[MAX_KATEGORIEN];
		int copyCnt = 0;
		
		for(Kategorie k: alleKategorien)
		{
			if(k != kategorie)
			{
				copyArray[copyCnt] = k;
				copyCnt++;
			}
			
		}
		
		alleKategorien = copyArray;
		kategorienCounter = copyCnt;
	}
	
	public void removeKategorieByIndex(int index)
	{
		Kategorie[] copyArray = new Kategorie[MAX_KATEGORIEN];
		int copyCnt = 0;
		
		for(int i = 0; i < alleKategorien.length; i++)
		{
			if(i != index)
			{
				copyArray[copyCnt] = alleKategorien[i];
				copyCnt ++;
			}
		}
		
		alleKategorien = copyArray;
		kategorienCounter = copyCnt;
	}
	
	
}
