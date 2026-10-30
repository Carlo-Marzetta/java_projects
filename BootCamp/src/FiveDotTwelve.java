import java.util.Scanner;


public class FiveDotTwelve 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Welches Datum möchten Sie überprüfen? (dd/MM/yyyy) >");
		String input = read.nextLine();
		
		String[] date = input.split("/");
		
		int day = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int year = Integer.parseInt(date[2]);
		
		String validation = isValidDate(day, month, year);
		
		if (isThisALeapYear(year) == true)
		{
			System.out.println("Schaltjahr");
		}
		else
		{
			System.out.println("Kein Schaltjahr");
		}
		System.out.print(validation);
		
	}
	
	
	private static String isValidDate(int d, int m, int y)
	{
		
		int[] einunddreissig = new int[] {1, 3, 5, 7, 8, 10, 12};
		
		if(m > 12 || m < 1)
		{
			return "Monat Ungültig";
		}
		else if(containsInt(einunddreissig, m) == false && (d > 30 || d < 1))
		{
			return "Tag ungültig";
		}
		else if(isThisALeapYear(y) == false && d > 28 && m == 2)
		{
			return "Tag ungültig";
		}
		else if(isThisALeapYear(y) == true && d > 29 && m == 2)
		{
			return "Tag ungültig";
		}
		else if ((d > 4 || d < 15) && m == 10 && y == 1582)
		{
			return "Datum nicht existent";
		}
		else 
		{
			return "Gültiges Datum";
		}
	}
	
	private static boolean containsInt(int[] array, int num)
	{
		for (int i: array)
		{
			if (i == num)
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean isThisALeapYear(int year)
	{		
		if(year % 400 == 0)
		{
			return true;
		}
		else if (year % 100 == 0)
		{
			return false;
		}
		else if (year % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
