/*
 * Die Klasse Zoo beschreibt den Zoo mit seinem Namen.
 * 
 */
public class Zoo {
	private String zooName;
	private Tier[] alleTiere;
	private int tierCounter = 0;
	private Gebaeude[] alleGebaeude;
	private int gebaeudeCounter = 0;
	
	
	
	public static void main(String[] args)
	{
		Affe max, moritz;
		Loewe jeff;
		Pinguin dan, darry, dalton, doyle, danny;
		Zebra z1, z2;
		Stall s;
		Becken b;
		Gehege g1, g2, g3, g4;
		Restaurant r;
		
		max = new Affe("Max", 10);
		moritz = new Affe("Moritz", 10);
		
		dan = new Pinguin("Dan", 15);
		darry = new Pinguin("Darry", 16);
		dalton = new Pinguin("Dalton", 14);
		doyle = new Pinguin("Doyle", 13);
		danny = new Pinguin("Danny", 16);
		
		z1 = new Zebra("z1", 25);
		z2 = new Zebra("z2", 30);
		
		Tier[] tiere;
		tiere = new Tier[] {max, moritz, dan, darry, dalton, doyle, danny, z1, z2};
		
		s = new Stall("Stall", 50);
		b = new Becken("Becken", 45);
		g1 = new Gehege("Gehege", 35);
		g2 = new Gehege("Gehege", 40);
		g3 = new Gehege("Gehege", 45);
		g4 = new Gehege("Gehege", 50);
		r = new Restaurant("Restaurant", 80, 120);
		
		Gebaeude[] gebeaude;
		gebeaude = new Gebaeude[] {s, b, g1, g2, g3, g4, r};
		
		Zoo z;
		z = new Zoo("Full'o'Faggts", tiere.length, gebeaude.length);
		
		System.out.println(z.toString(tiere, gebeaude));
		System.out.println("" +"Totalwert: " + z.getInventar(tiere, gebeaude));

	}
	
	
	public int getInventar(Tier[] _Tiere, Gebaeude[] _gebeaude)
	{
		int wert = 0;
		
		for(Tier t: _Tiere)
		{
			wert += t.getInventarWert();
		}
		for(Gebaeude g: _gebeaude)
		{
			wert += g.getInventarWert();
		}
		
		return wert;
	}

	public Zoo(String name, int anzTiere, int anzGebaeude){
		zooName      = name;
		alleTiere    = new Tier[anzTiere];
		alleGebaeude = new Gebaeude[anzGebaeude];
	}

	public String getZooName(){
		return zooName;
	}

	public void addTier(Tier einTier){
		alleTiere[tierCounter++] = einTier;
	}
	

	public void addGebaeude(Gebaeude einGebaeude){
		alleGebaeude[gebaeudeCounter++] = einGebaeude;
	}

	public String toString(Tier[] _t, Gebaeude[] _g){
		return "Zoo : "+ zooName + " mit " + _g.length +" Gebäuden und " +  _t.length + " Tieren";
	}
	


}
