import java.util.Scanner;


public class FiveDotSeven 
{
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args)
	{

		
		System.out.print("Was wollen Sie berechnen? Umfang eines Kreises? (1) Fläche eines Kreises? (2) Oberfläche einer Blechdose? (3) >");
		int auswahl = read.nextInt();
		
		if (auswahl == 1)
		{
			umfang();
		}
		else if (auswahl == 2)
		{
			flaeche();
		}
		else if (auswahl == 3)
		{
			dose();
		}
		
	}
	
	private static void umfang ()
	{
		System.out.print("Radius >");
		double radius = read.nextDouble();
		
		System.out.print(kreisumfang(radius));
	}
	
	private static void flaeche ()
	{
		System.out.print("Radius >");
		double radius = read.nextDouble();
		
		System.out.print(kreisflaeche(radius));
	}
	
	private static void dose ()
	{
		System.out.print("Radius >");
		double radius = read.nextDouble();
		System.out.print("Höhe >");
		double hoehe = read.nextDouble();
		
		System.out.print((mantelFlaeche(radius, hoehe) + kreisflaeche(radius)) * 2);
	}
	
	private static double kreisumfang (double _rad)
	{
		return Math.PI * _rad * 2;
	}
	
	private static double kreisflaeche (double _rad)
	{
		return Math.pow(_rad, 2) * Math.PI;
	}
	
	private static double mantelFlaeche(double _rad, double _height)
	{
		return (Math.pow(_rad, 2) * Math.PI * _height);
	}
}
