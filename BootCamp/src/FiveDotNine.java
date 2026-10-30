import java.util.Scanner;


public class FiveDotNine 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner (System.in);
		System.out.print("Zahl >");
		double num = read.nextDouble();
		
		System.out.print("Exponent >");
		double exp = read.nextDouble();
		
		System.out.print(resultat(num, Math.abs(exp)));
	}

	private static double resultat (double num, double exp)
	{
		double myNum = num;
		
		for (int i = 1; i < exp; i++)
		{
			num = num * myNum;
		}
		
		return num;
	}
}
