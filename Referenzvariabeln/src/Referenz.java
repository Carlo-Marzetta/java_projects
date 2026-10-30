
public class Referenz 
{
	public static void main(String[] args)
	{
		Integer zahl1;
		Integer zahl2;
		Integer zahl3;
		
		zahl1 = new Integer(1);
		zahl2 = new Integer(1);
		zahl3 = zahl1;
		
		if (zahl1.equals(zahl2))
		{
			System.out.print("gleich");
		}
		else
		{
			System.out.print("ungleich");
		}
		
		if (zahl1 == zahl2)
		{
			System.out.print("gleich");
		}
		else
		{
			System.out.print("ungleich");
		}
		
		if (zahl1 == zahl2 && zahl1 == zahl3)
		{
			System.out.print("gleich");
		}
		else
		{
			System.out.print("ungleich");
		}
	}
}