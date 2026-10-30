import java.util.Scanner;


public class FourDotFourteen 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Geben Sie den Winkel ein >");
		
		double angle = read.nextFloat();
		
		angle = Math.toRadians(angle);
		
		System.out.println(Math.sin(angle));
		
	}
}
