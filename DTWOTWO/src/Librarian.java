/**
   Die Klasse repräsentiert den Bibliotheker.
   <p>Der Bibliothekar;
   <ul>
       <li>kauft neue Bücher ein, buyNewBook()</li>
       <li>leiht Bücher dem Kunden aus, borrow_aBookToCustomer.....()</li>
       <li>nimmt Bücher zurück, getABookFromCustomer</li>
       <li>mahnt den Kunden, remindCustomer()</li>
       <li>entfernt Bücher aus der Bibliothek, </li>
   </ul></p>
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Librarian{
  
  private Library library;
  
  /**
  Initialisiert das Objekt. Dabei wird die Referenz zur Bibliothek
  bekannt gemacht.
  */
  public Librarian(Library _library){
    library = _library;
  }
  
  /**
  Ein neues Buch mit Titel und ISBN-Nummer wird der Bibliothek beigefügt.
  <p>Die Methode erstellt ein neues Buch und fügt es der Bibliothek zu.
  Von der Bibliothek wird der Ablageort mitgeteilt, der dann dem Buch
  übergeben wird.</p>
  @param Titel des Buchs
  @param ISBN-Nummer des Buchs
  */
  public void buyNewBook(String title, String isbn)
  {
	  
	  Book aBook;
	  aBook = new Book(title, isbn);
	  
	  String placement = library.addBook(aBook);
	  
	  aBook.setPlacement(placement); 
	  
	  
	  // nach Sequenzdiagramm implementieren
    //....just do it zhuorrasic park
    
    
    /* Hinweis:
    Aufrufe können ineinander geschachtelt sein. Es ist üblich, das
    so zu machen, dient aber nicht der Übersichtlichkeit (vor allem
    nicht für Anfänger). 
    */
  }
  
  /**
  Das angefragte Buch wird dem Kunden ausgeliehen.
  <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
  Fall gibt der Bibliothekar einen Hinweis aus. </p>
  @param Titel des Buchs
  @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
  */
  public Book borrow_aBookToCustomerByTitle(String title)
  {
    // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
    // gezeigten Struktogrammden Code.
    //
    //    +-----------------------------------------------------------------+
    //    ¦ suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      ¦
    //    +-----------------------------------------------------------------+
    //    ¦ if (gültige Buchreferenez)                                      ¦
    //    ¦    --+----------------------------------------------------------+
    //    ¦ then ¦ > return Buchreferenz                                    ¦
    //    ¦    --+----------------------------------------------------------+
    //    ¦ else ¦ gib eine Meldung aus, dass Buchtitel nicht in Bibliothek ¦
    //    ¦      +----------------------------------------------------------+
    //    ¦      ¦ > return null                                            ¦
    //    +------+----------------------------------------------------------+
    //
    //....do it
      Book aBook = library.searchBookByTitle(title);
      if (aBook != null) 
      {
    	return library.getBook(aBook.getPlacement());
      } // end of if
      else{
        System.out.println("Das Buch mit dem Titel'"+title+"' ist nicht verfügbar");
        return null;
      }
    
  }
    /**
    Das angefragte Buch wird dem Kunden ausgeliehen.
    <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
    Fall gibt der Bibliothekar einen Hinweis aus. </p>
    @param ISBN-Nummer des Buchs
    @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
    */
    public Book borrow_aBookToCustomerByISBN(String isbn)
    {
      Book aBook = library.searchBookByISBN(isbn);
      if (aBook != null) {
        return aBook;
      } // end of if
      else{
        System.out.println("Das Buch mit der ISBN-Numemr'"+isbn+"' ist nicht verfügbar");
        return null;
      }
    }
    
    
    /**
    Das gelieferte Buch wird in die Bibliothek zurückgestellt.
    @param Referenz auf das Buch
    */
    public void getABookFromCustomer(Book aBook){
      // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
      //....do it
    	
    	library.putBook(aBook);
      
    }
    
    /**
    Erinnert den Kunden, dass eine Ausleihe noch offen ist.
    @param Referenz des Kunden, der gemahnt wird
    */
    public void remindCustomer(Customer theCustomer){
      // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
      // Der Text "Kunde 'name' wird gemahnt, das Buch 'Titel' zurückzubringen" wird ausgegeben
      //....do it
    	theCustomer.remind();
    	theCustomer.getName();
    	theCustomer.getTitleOfBorrowedBook();
      System.out.println("");
      
    } 
    
    
    /**
    Entfernt ein Buch aus der Bibliothek. 
    Das Buch wird anhand seiner Referenz identifiziert.
    @param Referenz des Buchs
    */
    public void removeBook(String title){
      // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
      // gezeigten Struktogrammden Code.
      //
      //    +-----------------------------------------------------------------+
      //    ¦ suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      ¦
      //    +-----------------------------------------------------------------+
      //    ¦ if (gültige Buchreferenz)                                       ¦
      //    ¦    --+----------------------------------------------------------+
      //    ¦ then ¦ entferen Buch aus der Bibliothek                         ¦
      //    +------+----------------------------------------------------------+
      //
      //....do it
    	Book aBook = library.searchBookByTitle(title);
    	
    	if(aBook != null)
    	{
    		library.removeBook(aBook);
    	}
      
    }
  }