import java.util.Scanner;

 // Geldbetrag
// Von Carlo
// v 1.0

public class SixDotThirteen 
{
	public static void main(String[] args)
	{
		new SixDotThirteen().start();
	}
	
	
	
	private void start ()
	{
		Scanner read = new Scanner(System.in);
		
		double[] betraege = new double[] {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000, 50000};
		int[] anzahlM = new int[]  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String[] bezeichnungen = new String[] {"1 Cent", "2-Cent", "5-Cent", "10-Cent", "20-Cent", "50-Cent", "1-Euro", "2-Euro", "5-Euro", "10-Euro", "20-Euro", "50-Euro", "100-Euro", "200-Euro", "500-Euro" };
		
		
		System.out.print("Betrag >");
		double betrag = read.nextDouble();
		betrag = betrag * 100;
		
		int i = 14;
		
		System.out.println(betraege[14]);
		
		while(i >= 0)
		{
			if(betrag >= betraege[i])
			{
				anzahlM[i]++;
				betrag -= betraege[i];
			}
			else 
			{
				i--;
			}
		}
		
		
		for (int e = 0; e < 15; e++)
		{
			System.out.println(bezeichnungen[e] + "  ->  " + anzahlM[e]);
		}
	}
}
