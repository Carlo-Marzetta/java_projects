
public class Schule {

	
	public static void main(String[] args)
	{
		Klasse klasse;
		
		klasse = new Klasse("Klasse1A");
		
		String[] nachnamen;
		String[] vornamen;
		int[] geburtsjahre;
		
		nachnamen = new String[] {"Meier", "öztürk", "Gavranovic", "Schneider", "Brönnimann"};
		vornamen = new String[] {"Bea", "Musti", "Bela", "Kurt", "Peter"};
		geburtsjahre = new int[] {2002, 2001, 2002, 2003, 2002};
		
		Lehrperson lempel;
		
		lempel = new Lehrperson("Lempel", "Johann");
		
		klasse.setLehrperson(lempel);
		
		for (int i = 0; i < 5; i++)
		{
			Lernende l;
			l = new Lernende(nachnamen[i], vornamen[i], geburtsjahre[i]);
			
			klasse.addLernende(l);
		}
		
		
		System.out.println("Info zur Klasse: " + klasse.getKlassenname());
		System.out.println("Lehrperson: " + klasse.getLehrperson());
		System.out.println(klasse.getAnzahlLernende() + " Lernende: ");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("	"+klasse.getNameLernende(i) + ", " + klasse.getGeburtsjahrLernende(i));
		}
	}
}
