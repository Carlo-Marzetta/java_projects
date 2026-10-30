
public class SelectionSort 
{
	public static void main(String[] args)
	{
		int[] feld;//Deklaration array
		feld = new int[] {6,4,8,2,9,5,21,65,86};// Initialisation array
		
		int min = 0, max = feld.length; // min, max index des arrays wird festgelegt
		
		
		
		
		for(int i = min; i < max-1; i++)//Schleift durch den Array
		{
			int a = feld[i];
			for(int j = i+1; j<max; j++)//Findet ein grösseres Element
			{
				if(feld[j] < a)
				{
					//_______SWAP________
					a = feld[j];
					feld[j] = feld[i];
					feld[i] = a;
				}
			}
		}
		
		for(int i : feld)// Ausgabe des Arrays
		{
			System.out.println(i);
		}
	}
}
