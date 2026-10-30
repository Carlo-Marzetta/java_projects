import java.util.Scanner;


public class FourDotThree
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("1. Zahl >");
		float first = read.nextFloat();
		System.out.print("2. Zahl");
		float scnd = read.nextFloat();
		System.out.println(first * scnd);
	}
}
