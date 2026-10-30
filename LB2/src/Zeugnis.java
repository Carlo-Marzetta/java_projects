/**
  *
  * Stelt ein Notenblatt für eine Person dar.
  * Das Notenblatt wird über Name und Vorname zugewiesen.
  * Es enhält eine beliebige Anzahl von Fächern mit dem 
  * Notenschnitt pro Fach.
  *
  * @version 1.0 vom 29.06.2016
  * @author 
  */

import java.util.*;

public class Zeugnis {
  
  // Anfang Attribute
  private final int SIZE=10;
  private Vector<Fach> faecher;
  private String name;
  private String vorname;
  // Ende Attribute
  
  /**
  * Erzeugt ein Zeugnis-Objekt. Es müssen zwingend Name und Vorname
  * der Person eingetragen werden (kein Defaultkonstruktor) 
  */
  public Zeugnis(String name, String vorname){
    faecher = new Vector<Fach>(SIZE);
    this.name = name;
    this.vorname = vorname;
  }
  
  
  // Anfang Methoden
  /**
  * Fügt dem Zeugnis ein Fach zu.
  * @param Fach
  */
  public void addFach(Fach fach){
    faecher.add(fach);  
  }
    
  /**  
  * Liefert ein Fach-Objekt
  * @return Fachobjekt
    */ 
  public Fach getFach(int index) {
    return faecher.get(index);
  }
  
  /**
  * Liefert den Namen der Person, der das Zeugnis zugeteilt ist.
  * @return Name 
  */
  public String getName() {
    return name;
  }
  
  /**
  * Liefert den Vornamen der Person, der das Zeugnis zugeteilt ist.
  * @return Vorname 
  */
  public String getVorname() {
    return vorname;
  }
  
  /**
  * Liefert die Anzhal der erfassten Fächer.
  * @return Anzahl Fächer
  */
  public int getAnzFaecher(){
    return faecher.size(); 
  }
  
  /**
  * Liefert die Grösse des Containers für die Fächerverwaltung.
  * @return Grösse des Containers
  */
  public int getSize(){
    return SIZE;  
  }
    
    /**
      * gibt das vollständige Zeugnis einer Person aus.
    */
  public void print(){
    System.out.println("Zeugnis für\n-----------------------------");
    System.out.println(vorname + " " + name + "\n-----------------------------");  
    for (int i=0; i<getAnzFaecher(); i++) {
      System.out.println(readFach(i));  
    }
  }
  
  private String readFach(int index){
    Fach f = faecher.get(index);
    return f.getFachbezeichnung()+ ": \t" + f.getNotenschnitt();
  }
    
  public void sortieren()
  {
	  Collections.sort(faecher);
  }
    
  public static void main(String[] args){
    Zeugnis z = new Zeugnis("Muster", "Max");
    Fach f;
    //
    
    try
    {
    f = new Fach("Mathe");
    f.addNote(1, 4.6f);
    f.addNote(2, 4.9f);
    z.addFach(f);
    f = new Fach("Deutsch");
    f.addNote(1, 5.2f);
    f.addNote(2, 5.7f);
    z.addFach(f);
    f = new Fach("Informatik");
    f.addNote(1, 4.6f);
    f.addNote(2, 4.8f);
    f.addNote(3, 5.1f);
    z.addFach(f);
    //
    }
    catch(NotenWertException ex)
    {
		  System.out.println(ex.getMessage());
    }
    catch(NotenAnzahlException ex)
    {
		  System.out.println(ex.getMessage());
    }
    z.sortieren();
    
    z.print();  
  }
  
  // Ende Methoden
} // end of Zeugnis
