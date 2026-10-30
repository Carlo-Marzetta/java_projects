
/* Author: Marzetta,Carlo
 * Datum: 24/01/2019
 * Version 1.0
 * BZZ
 */

public class PotenzenRechnen
{
	
	public static void main(String[] args)
	{
		System.out.println(calculate(6, 3));
		
		System.out.println(iterationCalculation(15 ,2));
	}
	
	
	public static int calculate(int basis, int expo)// Kalkulation mittels Rekursion
	{
		if(expo != 0)
		{
			return basis *= calculate(basis, expo-1);//Rekursion wird angewendet-->es geht weiter nach unten
		}
		else
		{
			return 1;//Man ist am tiefsten Punkt der Rekursion angelangt
		}
	}
	
	public static int iterationCalculation(int basis, int expo)// Kalkulation mittels Iteration
	{
		int resultat = 1;
		for(int i = expo; i > 0; i--)//expo Male wiederholt
		{
			resultat *= basis;
		}
		return resultat;
	}
}
