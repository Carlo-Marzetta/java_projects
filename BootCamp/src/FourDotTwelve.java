import java.util.Scanner;


public class FourDotTwelve 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Menschen >");
		double menschen = read.nextDouble();
		double lol = menschen;
		
		for (int i = 1; i < lol; i++)
			
		{
			menschen = menschen * i;
		}
		System.out.print(menschen);
	}
}