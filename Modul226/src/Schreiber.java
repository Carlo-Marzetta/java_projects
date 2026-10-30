
public class Schreiber 
{
	public static void main(String[] args)
	{
		Schreiber[] referenzen;
		referenzen = new Schreiber[5];
		referenzen[0] = new Schreiber("Blau", 4);
		referenzen[1] = new Schreiber("Grün", 21);
		referenzen[2] = new Schreiber("Rot", 36);
		referenzen[3] = new Schreiber("Gelb", 42);
		referenzen[4] = new Schreiber("Pink", 666);
		
		for(Schreiber i: referenzen)
		{
			i.print();
		}
		
		
		System.out.println("Total Instanzen : "	+ Schreiber.count);
	}
	
	private static int count = 0;
	private String farbe;
	private int nr;
	
	public Schreiber(String farbe, int nummer)
	{
		this.farbe = farbe;
		count++;   					//Zähler für die Instanzen der Klasse 
	}
	
	public void print ()
	{
		System.out.println(farbe + count);
	}
}
