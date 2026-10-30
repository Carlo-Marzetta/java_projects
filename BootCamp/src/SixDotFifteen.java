import java.util.Scanner;



public class SixDotFifteen 
{
	public static void	main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		
		System.out.print("Geben Sie bitte die aktuelle Spielsituation ein(x/o) ?/?/?");
		String firstLine = read.nextLine();
		firstLine += "/";
		firstLine += read.nextLine();
		firstLine += "/";
		firstLine += read.nextLine();
		
		String[] situation = firstLine.split("/");
		
		
	}
}
