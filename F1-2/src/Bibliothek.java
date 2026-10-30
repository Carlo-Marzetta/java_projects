
public class Bibliothek 
{
	private PrintMedium[] medienListe;
	private int medienCntr;
	public final int MAX_MEDIEN = 10;
	
	
	Bibliothek()
	{
		medienListe = new PrintMedium[MAX_MEDIEN];
	}
	
	public int getMedienCntr()
	{
		return medienCntr;
	}
	
	public void addMedium(PrintMedium medium)
	{
		for (int i = 0; i < MAX_MEDIEN; i++)
		{
			if(medienListe[i] == null)
			{
				medienListe[i] = medium;
				return;
			}
		}
	}
	
	public PrintMedium getMedium(int index)
	{
		return medienListe[index];
	}
	
	
	public int getMAX_MEDIEN()
	{
		return MAX_MEDIEN;
	}
	
	public void printOut()
	{
		System.out.println("\n\nInventar der Bibliothek\n----------------------------------");
		for(PrintMedium pm: medienListe)
		{
			if(pm != null)
			System.out.println(pm.getTitel() + " " + pm.getVerlag());
		}
	}
	
	
	
	void showInventory()
	{
		for(PrintMedium pm : medienListe)
		{
			if(pm != null)
			{
				pm.showInfo();
			}
		}
	}
}
