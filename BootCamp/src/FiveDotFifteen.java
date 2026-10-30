import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class FiveDotFifteen 
{
	
	private static ArrayList<Integer> moeglichkeiten = new ArrayList<Integer>();
	private static ArrayList<Integer> hoechstesFeld = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{

		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Startfeld: (1-99) >");
		int start = read.nextInt();
		
		if(start > 99 || start < 1)
		{
			System.out.println("Ungültige Auswahl");
		}
		else
		{
			spielen(start);
		}
		
		
		
		for (int i = 1; i < 99; i++)
		{
			spielen(i);
		}
		
		System.out.println("Höchster Gewinn: " + Collections.max(moeglichkeiten) + "\nHöchstes erreichbares Feld: " + Collections.max(hoechstesFeld));
		
	}
	
	private static void spielen(int start)
	{
		
		int profit = 0;
		
		while(start != 1)
		{			
			profit += start;
			
			if(start % 2 == 0)
			{
				start = start/2;
			}
			else
			{
				start = (start * 3) + 1;
			}
			
			hoechstesFeld.add(start);

		}
		
		
		profit ++;
		moeglichkeiten.add(profit);

		
		System.out.println(profit);
	}
}
