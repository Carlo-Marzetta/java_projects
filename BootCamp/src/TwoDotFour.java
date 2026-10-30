import java.util.Scanner;


public class TwoDotFour 
{
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args)
	{
		A();
	}
	
	private static void A ()
	{
		Double m_R1;
		Double m_R2;
		
		
		try
		{
			System.out.print("Geben Sie bitte den ersten Widerstand ein >");
			
			
			m_R1 = read.nextDouble();
			
			System.out.println("Geben Sie bitte den zweiten Widerstand ein >");
			
			m_R2 = read.nextDouble();
			
			System.out.println(m_R1 + m_R2);
			Double x = Math.pow((Math.pow(m_R1, -1) + Math.pow(m_R2, -1)), -1);
			
			System.out.println(x);
		}
		catch(Exception ex)
		{
			System.out.println("FALSCH");
		}
		
	}
}
