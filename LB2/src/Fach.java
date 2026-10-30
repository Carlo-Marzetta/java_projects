/**
  *
  * Die Klasse bildet ein Schulfach ab. Das Fach weist eine Bezeichnung auf
  * und hält bis max. 5 Notenwert.
  *
  * @version 1.0 vom 29.06.2016
  * @author 
  */
import java.util.*;

public class Fach implements Comparable<Fach> {
  
  // Anfang Attribute
  private final int SIZE = 5;
  private String fachbezeichnung;
  private Note[] noten;
  private int cntr=0;
  // Ende Attribute
  
  
  public static void main(String[] args)
  {
	  Fach fach = new Fach("Informatik");
	  
	  try
	  {
	  fach.addNote(1, 6);
	  fach.addNote(2, 5);
	  fach.addNote(3, 4);
	  fach.addNote(4, 3);
	  }
	  catch(NotenWertException ex)
	  {
		  System.out.println(ex.getMessage());
	  }
	  catch(NotenAnzahlException ex)
	  {
		  System.out.println(ex.getMessage());
	  }
	  
	  System.out.println(fach.toString());
  }
  
 
  /**
  * Erzeugt ein Fachobjekt mit einem Container für 5 Notenwerte.
  */
  public Fach(){
    noten = new Note[SIZE];
  }
  
  /**
  * Erzeugt ein Fachobjekt mit einem Container für 5 Notenwerten und
  * der Fachbezeichnung.
  * @param bezeichnung
  */
  public Fach(String bezeichnung){
    this();
    fachbezeichnung = bezeichnung;  
  }
  
  
  
  /**
  * Legt die Fachbezeichnung fest.
  * @param bez
    */
  public void setFachbezeichnung(String bez){
    fachbezeichnung = bez;  
  }
  
  /**
  * Fügt den Notenwert mit der Laufnummer zu
  */
  public void addNote(int nr, float wert)throws NotenAnzahlException, NotenWertException
  {
	  if(wert > 6f || wert < 1f)
	  {
		  throw new NotenWertException();
	  }
	  else if(cntr == SIZE)
	  {
		  throw new NotenAnzahlException();
	  }
	  else
	  {
		  noten[cntr++] = new Note(nr, wert);
	  }
  }
  
  /**
     Liefert due Bezeichnung des Fachs
  @return  Fachbezeichnung
    */
  public String getFachbezeichnung() {
    return fachbezeichnung;
  }
  
  /**
    Liefert ein Notenobjekt an der Position index.
    @param index Nummer der Note
  @return Notenobjekt
    */
  public Note getNote(int index) throws NotenIndexException
  {
	  if(index <= 5 && index >= 0)
	  {
		  return noten[index];
	  }
	  else
	  {
		  throw new NotenIndexException();
	  }
  }
  
  /**
  * Liefert den Durchschnitt aller für das Fach erfassten Notenwerte.
  */
  public float getNotenschnitt(){
    float notensumme = 0.0f;
    for (int i=0; i < getAnzNotenwerte(); i++) {
      notensumme += noten[i].getNotenwert();
    } // end of for
    return notensumme / getAnzNotenwerte();
  }
    
  /**
  * Liefert die Anzahl der erfassten Noten.
  * @return Anzahl erfasste Notenwerte  
  */
  public int getAnzNotenwerte(){
    return cntr;
  }
    
  /**
  * Liefert die Grösse des Containers für die Notenverwaltung.
  * @return Grösse des Containers
  */
  public int getSize(){
    return SIZE;  
  }
  
  public String toString()
  {
	  String output = fachbezeichnung;
	  for(int i = 0; i<cntr; i++)
	  {
		  output += "\n	"+ noten[i].getLaufnummer() + ". Note: " + noten[i].getNotenwert();
	  }
	  output += "\nSchnitt: " + getNotenschnitt();
	  return output;
  }



public int compareTo(Fach f) {

	return fachbezeichnung.compareTo(f.getFachbezeichnung());
}
  
  // Ende Methoden
} // end of Fach
