import java.util.Scanner;


public class SixDotTen 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		FiveDotThirteen fdt = new FiveDotThirteen();
		
		int [] monatsTage = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int [] schaltjahrTage = new int [] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.print("Datum : (dd/mm/yyyy)");
		String input = read.nextLine();
		
		String[] date = input.split("/");
		
		int days =  Integer.parseInt(date[0]);
		int months = Integer.parseInt(date[1]);
		int years = Integer.parseInt(date[2]);
		

		if(fdt.isThisALeapYear(years))
		{
			for (int i = 1; i < months; i++)
			{
				days += monatsTage[i];
			}
		}
		else
		{
			for (int i = 1; i < months; i++)
			{
				days += schaltjahrTage[i];
			}
		}
		
		
		
		
		days --;
		System.out.println(days + " Tage sind in diesem Jahr schon vergangen.");
		
		
	}
}
