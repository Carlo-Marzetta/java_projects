
public class GruempiApp 
{
	public static void main(String[] args)
	{
		Kategorie k;
		
		k = new Kategorie("i.O",0);
		
		
		Mannschaft a;
		a = new Mannschaft("the best one",k);
		
		Mannschaft b;
		b = new Mannschaft("gugusäli", k);
		
		Schiri max;
		max = new Schiri("Mustermann", "Max", 21, true);
		
		Spiel s;
		s = new Spiel(12);
		
		s.setKategorie(k);
		s.setSchiri(max);
		
		if(s.setMannschaft_A(a) == true)
		{
			System.out.println("Mannschaft " + a.getName() + " i.O.");
		}
		
		
		if(s.setMannschaft_B(b) == true)
		{
			System.out.println("Mannschaft " + b.getName() +" i.O.");
		}
		
		s.setToreTeamA(3);
		s.setToreTeamB(5);
		
		System.out.println("Spiel " + s.getSpielNr() + ": " + a.getName() + " - " + b.getName() + ", Ergebnis " + s.getToreTeamA() + " : " + s.getToreTeamB());
		
	}
}
