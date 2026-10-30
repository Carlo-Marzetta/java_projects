import java.util.Scanner;


public class FiveDotOne 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Number >");
		int num = read.nextInt();
		
		System.out.print(istUngerade(num));
	}
	
	private static String istUngerade (int _zahl)
	{
		if (_zahl % 2 == 0)
		{
			return "Die Zahl ist gerade";
		}
		else 
		{
			return "Die Zahl ist ungerade";
		}
	}
}
