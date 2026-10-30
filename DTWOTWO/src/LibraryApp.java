


/**
  Hier werden alle benötigten Objekte erstellt
  <p>
     <ul>
         <li>theLibrary : Library (die Bibliothek)</li>
         <li>max        : Librarian (der Bibliothekar)</li>
         <li>moritz     : Customer (ein Kunde)</li>
         <li>ursula     : Customer (eine Kundin)</li>
     </ul>
  </p>
  
  <p>Das "Drehbuch" wird gemäss Sequenzdiagramm der Aufgabenstellung
  implementiert.<br>
  Dazu braucht es auch Anpassungen in den Klassen
  <ul>
      <li>Librarian</li>
      <li>Customer</li>
  </ul>
  Die Klassen Library und Book müssen nicht bearbeitet werden.
  
  @Author:   bitte Namen ergänzen
  @Date:     aktuelles Bearbeitungsdatum eintragen
  @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class LibraryApp{
  
  
  /* 
  Hier den Ablauf implementieren
  */
  public static void main(String[] args){
	  
	  
	  Library library;
	  library = new Library();
	  
	  Librarian max;
	  max = new Librarian(library);
	  
	  Customer moritz, ursula;
	  moritz = new Customer("Moritz", max);
	  ursula = new Customer("Ursula", max);
	  
	  
	  max.buyNewBook("JavaForDummies", "271834");
	  max.buyNewBook("JavaForDummies2", "271835");
	  max.buyNewBook("JavaForDummies3", "271836");
	  max.buyNewBook("JavaForDummies4", "271837");
	  max.buyNewBook("JavaForDummies5", "271838");
	  
    // Teilauftrag 1
    // -------------
    // Deklaration der Hauptklassen
    //....do it
    
    // Erzeugen der Objekte
    //....do it
    
    
    // -------------
    // Teilauftrag 2
    // -------------
    // Bücher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
    //...do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    
    ursula.borrow_aBookByTitle("JavaForDummies3");
    moritz.borrow_aBookByTitle("JavaForDummies2");
    
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // -------------
    // Teilauftrag 4
    // -------------
    // Eine Kundin bringt das Buch selbständig zurück.
    
    ursula.bringBackABook();
    
    System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zurück");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    
    library.printInventory();
    //....do it
    
    // Ein Kunde wird gemahnt und bringt dann sein Buch zurück
    
    max.remindCustomer(moritz);
    System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 5:
    // --------------    
    //Der Bibliothekar entfernt ein Buch aus der Bibliothek
    
    max.removeBook("JavaForDummies5");
    System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do itlibrary.printInventory();
    library.printInventory();
    
  }
}