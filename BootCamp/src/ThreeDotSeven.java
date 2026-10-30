import java.util.Scanner;


public class ThreeDotSeven 
{
	public static void main(String[] args)
	{
		float kg = 0f;
		float height = 0f;
		String geschl = "M";
		Scanner read = new Scanner(System.in);
		try
		{
			System.out.print("Geben Sie bitte Ihr Gewicht ein. >");
			kg = read.nextFloat();
			System.out.print("Geben Sie bitte Ihre Körpergrösse in Centieter ein. >");
			height = read.nextFloat();
			if (height > 3)
			{
				height = height/100;
			}
			System.out.print("Geben Sie bitte Ihr Geschlecht ein. (M/F) >");
			geschl = read.nextLine();
		}
		catch (Exception ex)
		{
			System.out.println("Ungültige Eingabe");
		}
	
		float m_BMI = kg / (height * height);
		
		if ("F".contains(geschl))
		{
			if (m_BMI < 19)
			{
				skinny();
			}
			else if (m_BMI <= 24)
			{
				normal();
			}
			else
			{
				obese();
			}
			
		}
		
		else if ("M".contains(geschl))
		{
			if (m_BMI < 20)
			{
				skinny();
			}
			else if (m_BMI <= 25)
			{
				normal();
			}
			else
			{
				obese();
			}
			
		}
		
		System.out.println(m_BMI);
	}
	

	
	private static void skinny ()
	{
		System.out.println("Get ur skinny ass to McDonalds n shit");
	}
	private static void normal ()
	{
		System.out.println("You got the normal Weight");
	}
	private static void obese ()
	{
		System.out.println("You fat af fam.");
	}
	
}
