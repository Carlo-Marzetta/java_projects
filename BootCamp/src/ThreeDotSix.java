import java.util.Scanner;


public class ThreeDotSix 
{
	public static void main(String[] args)
	{
		
		Scanner read = new Scanner(System.in);
		try
		{
			System.out.print("Was ist Ihr Alter? >");
			int alter = read.nextInt();
			
			System.out.print("Was ist Ihr Geschlecht? (F/M) >");
			String geschl = read.next();
			if(alter >= 18)
			{
				if ("F".contains(geschl))
				{
					if(alter < 65)
					{
						System.out.println("AHV-beitragspflichtig");
					}
					else
					{
						System.out.println("AHV-Empfänger");
					}
				}
				else if ("M".contains(geschl))
				{
					if(alter < 64)
					{
						System.out.println("AHV-beitragspflichtig");
					}
					else
					{
						System.out.println("AHV-Empfänger");
					}
				}
				else
				{
					System.out.println("Ungültige Eingabe");
				}
			}
			else
			{
				System.out.println("Noch nicht AHV-Beitragspflichtig");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Ungültige Eingabe");
		
		}
	}
}
