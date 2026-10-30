import java.util.ArrayList;
import java.util.Scanner;

public class SixDotEleven 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		String[] wochenTage = new String[] {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		
		System.out.print("Vom 01/01/2001 bis zum 01/01/2401 (400 Jahre) :");
		String input = "1/1/2401";
		
		String[] date = input.split("/");
		
		int day = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int year = Integer.parseInt(date[2]);
		
		if(day == 12 && month == 1 && year == 2017)
		{
			for (double i = 0; i < Double.MAX_VALUE; i++)
			{
				System.out.println();
				for(double e = 0; e < i; e ++)
				{
					System.out.print("--DESPACITO--");
				}
			}
		}
		
		int tage = 0;
		
		boolean validDate = isValidDate(day, month, year);
		
		int anzJahre = Math.abs(year - 2001);
		
		
		ArrayList<Integer> jahreszahlen = new ArrayList<Integer>();
		
		for (int i = 0; i <  anzJahre; i++)
		{
			jahreszahlen.add(i);
		}
		
		tage += jahreZuTage(jahreszahlen);
		
		
		if (year < 2001)
		{
			tage += monateZuTage(year, month, true);
			tage += tageImMonat(day, month, year, true);
			tage -= 302;

		}
		else
		{
			tage += monateZuTage(year, month, false);
			tage += tageImMonat(day, month, year, false);
			tage -= 1;
		}
		
		
		
		
		System.out.println("Anzahl Tage:" + tage);
		System.out.println(tage + " / 7 =" + tage/7);
	}
	
	
	private static int tageImMonat(int d, int m, int y, boolean vor)
	{
		int tage = 0;
		
		if(vor == false)
		{
			tage = d;
		}
		else
		{
			tage = (monateZuTage(y, m, true) - monateZuTage(y, (m - 1), true) - d);
		}
		
		return tage;
	}
	
	
	private static int monateZuTage (int y, int m, boolean vor)
	{
		int tage = 0;
		if(vor == false)
		{
			tage = monatsTageNach(y, m);
		}
		else
		{
			tage = monatsTageVor(y, m);
		}
		
		
		return tage;
	}
	
	
	private static int monatsTageVor(int y, int m)
	{
		int tage = 0;
		
		int[] einunddreissig = new int[] {1, 3, 5, 7, 8, 10, 12};
		int[] dreissig = new int[] {4, 6, 9, 11};
		
		if(isThisALeapYear(y) == true && m < 2)
		{
			tage += 29;
		}
		else if(isThisALeapYear(y) == false && m < 2)
		{
			tage += 28;
		}
		
		for (int i: einunddreissig)
		{
			if (i > m)
			{
				tage += 31;
			}
		}
		for (int e: dreissig)
		{
			if (e > m)
			{
				tage += 30;
			}
		}
		
		return tage;
	}
	
	private static int monatsTageNach (int y, int m)
	{
		int tage = 0;
		
		int[] einunddreissig = new int[] {1, 3, 5, 7, 8, 10, 12};
		int[] dreissig = new int[] {4, 6, 9, 11};
		
		if(isThisALeapYear(y) == true && m > 2)
		{
			tage += 29;
		}
		else if(isThisALeapYear(y) == false && m > 2)
		{
			tage += 28;
		}
		
		for (int i: einunddreissig)
		{
			if (i < m)
			{
				tage += 31;
			}
		}
		for (int e: dreissig)
		{
			if (e < m)
			{
				tage += 30;
			}
		}
		
		return tage;
	}
	
	
	
	
	private static int jahreZuTage (ArrayList<Integer> jahre)
	{
		int tage = 0;
		
		for (int i: jahre)
		{
			if(isThisALeapYear(i + 2001))
			{
				tage += 366;
			}
			else
			{
				tage += 365;
			}
		}
		
		return tage;
	}
	
	
	private static boolean isValidDate(int d, int m, int y)
	{
		
		int[] einunddreissig = new int[] {1, 3, 5, 7, 8, 10, 12};
		
		if(m > 12 || m < 1)
		{
			return false;
		}
		else if(containsInt(einunddreissig, m) == false && (d > 30 || d < 1))
		{
			return false;
		}
		else if(isThisALeapYear(y) == false && d > 28 && m == 2)
		{
			return false;
		}
		else if(isThisALeapYear(y) == true && d > 29 && m == 2)
		{
			return false;
		}
		else if ((d > 4 || d < 15) && m == 10 && y == 1582)
		{
			return false;
		}
		else 
		{
			return true;
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
	
	static boolean isThisALeapYear(int year)
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