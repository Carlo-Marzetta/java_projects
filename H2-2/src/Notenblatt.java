import java.util.*;

public class Notenblatt 
{
	public static void main(String[] args)
	{
		NotenListe nl = new NotenListe();
		nl.addFach("Mathematik", "(MAT)");
		nl.addFach("Deutsch", "(DEU)");
		nl.addFach("Englisch", "(ENG)");
		nl.addFach("Informatik", "(INF)");
		
		nl.addNote("Mathematik", 5, new GregorianCalendar(2010, 3, 3));
		nl.addNote("Deutsch", 5.5f, new GregorianCalendar(2009, 12, 15));
		nl.addNote("Englisch", 5.75f, new GregorianCalendar(2008, 3, 5));
		nl.addNote("Informatik", 4.5f, new GregorianCalendar(2007, 5, 16));
		nl.addNote("Informatik", 5.5f, new GregorianCalendar(2006, 2, 17));
		nl.addNote("Mathematik", 5.5f, new GregorianCalendar(2005, 8, 13));
		nl.addNote("Deutsch", 5.5f, new GregorianCalendar(2001, 4, 4));
		nl.addNote("Englisch", 5.75f, new GregorianCalendar(2002, 6, 5));
		nl.addNote("Informatik", 4.5f, new GregorianCalendar(2003, 3, 16));
		nl.addNote("Informatik", 5.5f, new GregorianCalendar(2004, 12, 17));
		
		nl.print();
		nl.sortiereNachFach();
		nl.sortiereNachWert();
		nl.print();
		
		nl.sortiereNachDatum();
		
		nl.print();
	}
}
