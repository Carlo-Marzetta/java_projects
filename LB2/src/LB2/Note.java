/**
  *
  * Stellt einen Notenwert eines Fachs dar.
  * Jede Note ist mit der Laufnummer der Pürfung versehen, also 1 für die 
  * 1. Prüfung, 2 für die 2. Prüfung usw.
  * Der Notwert ist selbsterklärend.
  *
  * @version 1.0 vom 29.06.2016
  * @author 
  */

public class Note {
  
  // Anfang Attribute
  private int laufnummer = 0;
  private float notenwert = 1.0f;
  // Ende Attribute
  
  
  /**
  * Erzeugt ein Notenobjekt mit Laufnummer und Notenwert.
  * @param nr die Laufnummer
  * @param note der Notenwert
  */
  public Note(int nr, float note)throws NotenWertException
  {
	  if(note <= 6f && note >= 1f)
	  {
		  setNotenwert(nr, note);  
	  }
	  else
	  {
		  throw new NotenWertException();
	  }
  }
  
  /**
  * Liefert die Laufnummer zur Note.
  * @return laufnummer
  */
  public int getLaufnummer() {
    return laufnummer;
  }
  
  /**
  * Liefert den Notenwert
  * @return notenwert  
  */
  public float getNotenwert() {
    return notenwert;
  }
  
  /**
  * Setzt den Notenwert.
  * @param nr die laufnummer der Note
  * @param note der Notenwert
  */
  public void setNotenwert(int nr, float note){
    laufnummer = nr;
    notenwert = note;
  }
    
  
  
  // Ende Methoden
} // end of Note
