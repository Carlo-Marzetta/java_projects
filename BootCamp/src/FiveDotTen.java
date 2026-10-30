import java.util.Scanner;


public class FiveDotTen 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Geschwindigkeit (km/h) >");
		double v = read.nextDouble();
		boolean chosen = false;
		
		System.out.print("Strasse nass? (T/N) >");
		String wet = read.next();
		double bremsV = 0;
		if (wet.equals("T"))
		{
			bremsV = 7f;
			chosen = true;
		}
		else if (wet.equals("N"))
		{
			bremsV = 4f;
			chosen = true;
		}
		
		v = v/3.6;
		
		if (chosen == true)
		{
			System.out.println("Reaktionsweg: " + reaktionsweg(v));
			System.out.println("Bremsweg: " + bremsweg(v, bremsV));
			System.out.println("Anhaltsstrecke: " + (bremsweg(v, bremsV) + reaktionsweg(v)));
		}
	}
	
	private static double reaktionsweg (double speed)
	{
		return (speed * 1.44f);
	}
	
	private static double bremsweg (double speed, double bbs)
	{
		return (speed / (2 * bbs));
	}
	
}
