import java.util.Scanner;


public class FiveDotFive 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		
		System.out.print("Punkt 1 X: >");
		float xOne = read.nextFloat();
		System.out.print("Punkt 1 Y: >");
		float yOne = read.nextFloat();
		System.out.print("Punkt 2 X: >");
		float xTwo = read.nextFloat();
		System.out.print("Punkt 2 Y: >");
		float yTwo = read.nextFloat();
		
		float x = xOne - xTwo;
		float y = yOne - yTwo;
		

		
		System.out.println("Distanz: " + berechne(x, y));
		
		
	}
	
	private static double berechne (float x, float y)
	{
		float pythagoras = (float) (Math.pow(x, 2) + Math.pow(y, 2));
		return Math.sqrt(pythagoras);
	}
}
