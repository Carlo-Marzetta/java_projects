package GUI;

public class Starter 
{
	
	public static void main(String[] args)
	{
		Anzeige a = new Anzeige();
		a.init();
		
		Rechner r = new Rechner();
		
		a.b.addActionListener(r);
		
		
		r.a = a;
	}
}
