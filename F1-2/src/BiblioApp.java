
public class BiblioApp 
{
	public static void main(String[] args)
	{
		AutorListe al;
		al = new AutorListe();
		Autor jf, db, mf;
		jf = new Autor("Jan Flemming");
		db = new Autor("Dan Brown");
		mf = new Autor("Max Frisch");
		Autor[] autoren = new Autor[] {jf, db, mf};
		
		for(Autor a: autoren)
		{
				al.addAutor(a);
		}
		al.printOut();
		
		Bibliothek bt;
		bt = new Bibliothek();
		
		Zeitschrift z1, z2;
		z1 = new Zeitschrift("NZZ", "Neue Zürcher Zeitung", "42/42/42069");
		z2 = new Zeitschrift("20 Minuten", "ta-media", "12/12/1212");
		Buch b1,b2, b3;
		b1 = new Buch("Inferno", "Lübbe", "ABC123", jf);
		b2 = new Buch("Dr. No", "Springer", "CBA321", db);
		b3 = new Buch("Illuminati", "Springer", "ACB132", mf);
		
		PrintMedium[] sachen;
		sachen = new PrintMedium[] {z1, z2, b1, b2, b3};
		
		for(PrintMedium pm: sachen)
		{
			bt.addMedium(pm);
		}
		
		bt.printOut();
		
		System.out.println("Titel				Verlag				isbnNr				Autor				Datum\n---------------------------------------------------------------------------------------------");
		
		bt.showInventory();


		
		
	}
}
