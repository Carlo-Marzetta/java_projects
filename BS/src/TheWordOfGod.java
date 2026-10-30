import java.util.Scanner;


public class TheWordOfGod 
{
	
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		String[] wortGottes = new String[] {"Z", "H", "U", "O","S","C","H","I","C","K","P","D","F"};
		System.out.print("Wieviele Worte Gottes willst du lesen?> ");
		double times = read.nextDouble();
		
		for(double i = 0; i < times; i++)
		{
			for(int e = 0; e < 12; e++)
			{
				System.out.print(wortGottes[e]);
			}
			if(i % 5 == 1)
			{
				System.out.print("\n");
			}
		}
	}
}
