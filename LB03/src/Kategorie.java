/**
  *
  * Die Klasse beschreibt eine Spielkategorie für das Grümpel-Turnier.
  * <p> Eine Kategorie legt fest
  * <ul><li>wie alt Spieler/Spielerinnen sein dürfen</li>
  *     <li>wie viele lizenzierte Spieler in einem Tema sien dürfen</li>
  * </ul>
  * </p>
  * <p>Die Anzahl der lizenzierten Spieler ist bei der Bildung eines Teams
  * zu beachten und muss dort sichergestellt sein.
  * </p>
  *
  * @version 1.0 vom 07.10.2014
  * @author  René Probst
  */

public class Kategorie {
  
  // Anfang Attribute
  private String bezeichnung;
  private int maxAnzahlLizenzierteSpieler;
  // Ende Attribute
  
  /**
  * Initialisiert das Kategorie-Objekt mit Bezeichnung und der Anzahl lizenzierter Spieler.
  * @param String           Bezeichnung der Kategorie
  * @param maxLizenziert    max. Anzahl von Spielern in einem Team mit Spiellizenz
  */
  public Kategorie(String bezeichnung, int maxLizenziert) {
    this.bezeichnung = bezeichnung;
    this.maxAnzahlLizenzierteSpieler = maxLizenziert;
  }
  
  // Anfang Methoden
  /**
  * Liefert die Bezeichnung der Kategorie.
  * @return Bezeichnung der Kategorie
  */
  public String getBezeichnung() {
    return bezeichnung;
  }

  
  /**
  * Legt die Bezeichnung der Kategorie fest.
  * @param String   Bezeichnung der Kategorie
  */
  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  
  /**
  * Liefert die Anzahl der max. zulässig lizenzierten Spieler eines Teams.
  * @return max. Anzahl der lizenzierten Spieler
  */
  public int getMaxAnzahlLizenzierteSpieler() {
    return maxAnzahlLizenzierteSpieler;
  }
  
  /**
  * Legt die Anzahl der max. zlässig lizenzierten Spieler eines Teams fest.
  * @param int      max. Anzahl von Spielern in einem Team mit Spiellizenz         
  */
  public void setMaxAnzahlLizenzierteSpieler(int maxAnzahlLizenzierteSpieler) {
    this.maxAnzahlLizenzierteSpieler = maxAnzahlLizenzierteSpieler;
  }
  
  // Ende Methoden
} // end of Kategorie
