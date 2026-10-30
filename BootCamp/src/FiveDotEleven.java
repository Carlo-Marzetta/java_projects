import java.util.Scanner;


public class FiveDotEleven 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Ueber welches Jahr möchten Sie sich informieren? >");
		int jahr = read.nextInt();
		
		System.out.print(isThisALeapYear(jahr));
	}
	
	private static String isThisALeapYear(int year)
	{
		
		String yes = "Dieses Jahr ist ein Schaltjahr.";
		String no = "Dieses Jahr ist kein Schaltjahr.";
		
		if(year % 400 == 0)
		{
			return yes;
		}
		else if (year % 100 == 0)
		{
			return no;
		}
		else if (year % 4 == 0)
		{
			return yes;
		}
		else
		{
			return no;
		}
	}
}
