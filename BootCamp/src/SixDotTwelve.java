import java.util.Scanner;


public class SixDotTwelve 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int[] rueckgelder = new int[] {2, 2, 3};
		
		System.out.print("Kosten in Cent >");
		int zuZahlen = read.nextInt();
		System.out.print("Zahlungsbetrag in Cent >");
		int gezahlt = read.nextInt();
		
		int fünfer = 0;
		int zweier = 0;
		int einer = 0;
		
		int rückbetrag = (gezahlt - zuZahlen) + 100;
		
		
		
		
		if(rückbetrag < 0)
		{
			System.out.println("Guthaben nicht ausreichend");
		}
		else if(rückbetrag == 0)
		{
			System.out.print("Kein Rückgeld");
		}
		else
		{
			while(rückbetrag > 500 && rueckgelder[2] > 0)
			{
				rückbetrag -= 500;
				rueckgelder[2]--;
				fünfer ++;
			}
			
			while(rückbetrag > 200 && rueckgelder[1] > 0)
			{
				rückbetrag -= 200;
				rueckgelder[1]--;
				zweier ++;
			}
			
			while(rückbetrag > 100 && rueckgelder[0] > 0)
			{
				rückbetrag -= 100;
				rueckgelder[0]--;
				einer ++;
			}
		}
		
		System.out.println("Ihr Rückgeld:\n Fünf-Euro-Münzen:" + fünfer + "\nZwei-Euro-Münzen: " + zweier + "\nEin-Euro-Münzen: " + einer);
		
	}
}
