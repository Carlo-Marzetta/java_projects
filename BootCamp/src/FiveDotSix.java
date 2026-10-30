import java.util.Scanner;


public class FiveDotSix 
{
	
	static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		System.out.print("Welche Methode möchten Sie benutzen= (1/2/3) >");
		int e = read.nextInt();
		if(e == 1)
		{
			ersteMethode();
		}
		else if (e == 2)
		{
			zweiteMethode();
		}
		else if (e == 3)
		{
			dritteMethode();
		}

		
	}
	
	
	private static void ersteMethode()
	{
		
		System.out.print("Seite a >");
		float a = read.nextFloat();
		System.out.print("Seite b >");
		float b = read.nextFloat();
		System.out.print("Seite c >");
		float c = read.nextFloat();
		
		double m_Umfang = umfang(a, b, c);
		
		System.out.println(flaeche(m_Umfang, a, b, c));
	}
	
	private static double umfang (float _a, float _b, float _c)
	{
		return (_a + _b + _c)/2;
	}
	
	private static double flaeche (double _umfang, float _a, float _b, float _c)
	{
		return Math.sqrt(_umfang * (_umfang - _a) * (_umfang - _b) * (_umfang * _c));
	}
	
	
	
	private static void zweiteMethode ()
	{
		System.out.print("Länge einer Seite: >");
		float seite = read.nextFloat();
		System.out.print("Höhe der entsprechenden Seite: >");
		float hoehe = read.nextFloat();
		
		System.out.print((seite * hoehe) / 2);
		
	}
	
	
	private static void dritteMethode()
	{
		System.out.print("Winkel gamma: >");
		float x = read.nextFloat();
		
		System.out.print("Seite b: >");
		float b = read.nextFloat();
		
		System.out.print("Seite a: >");
		float a = read.nextFloat();
		
		System.out.print(berechneFlaeche(x, a, b));
		
	}
	
	
	private static double berechneFlaeche (float gamma, float _a, float _b)
	{
		double hoeheB = _a * (Math.sin(gamma));
		return (hoeheB * _b) / 2 ;
	}
}
