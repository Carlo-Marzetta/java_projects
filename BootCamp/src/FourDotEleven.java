import java.util.Scanner;


public class FourDotEleven 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Zahl 1 >");
		float first = read.nextFloat();
		System.out.print("Zahl 2 >");
		float scnd = read.nextFloat();
		
		
		float firstfirst = first;
		
		
		while(scnd > 1)
		{
			first += firstfirst;
			scnd --;
		}
		
		System.out.println(first);
	}
}
