import java.util.*;
public class AutoApp 
{
	AutoListe al;
	public static void main(String[] args)
	{
		new AutoApp().Start();
	}
	
	void Start()
	{
		String[] marken = new String[] {"VW", "BMW", "Porsche", "McLaren", "Jeep"};
		String[] kantone = new String[] {"BE", "ZH", "AG", "SG", "ZG", "TI"};
		al = new AutoListe();
		
		for(int i = 0; i < 12; i ++)
		{
			al.addAuto(new Auto(marken[getRandomInt(0, marken.length - 1)], (kantone[getRandomInt(0, kantone.length - 1)] + getRandomInt(111111,999999)) ));
		}
		
		print();
		
		al.sortiereAuto();
		
		print();
		
		
		
	}
	
	public void print()
	{
		for(int i = 0; i < al.getSize(); i++)
		{
			System.out.println(al.getAuto(i).getKennzeichen() + al.getAuto(i).getMarke());
		}
	}

	
	
	public int getRandomInt(int min, int max)
	{
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
