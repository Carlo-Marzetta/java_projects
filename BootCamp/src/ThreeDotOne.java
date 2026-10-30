import java.util.Scanner;

public class ThreeDotOne 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);

		double y = 0;
		double a = 0;
		double price = 0;
		double x = 0;
		double t = 0;
		
		if(y >= 0)
		{
			System.out.println("Bedingung Erfüllt");
		}
		
		if (a > -2 && a < 5.3)
		{
			System.out.println("Bedingung Erfüllt");
		}
		
		if (price < 20/20)
		{
			System.out.println("Bedingung Erfüllt");
		}
		
		if (x < 5 && x % 2 == 0)
		{
			System.out.println("Bedingung Erfüllt");
		}
		
		if(t >= -3 && t < 8)
		{
			System.out.println("Bedingung Erfüllt");
		}
		
	}
}
