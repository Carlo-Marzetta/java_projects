/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public class HypoKontoErzeugungException extends Exception {
  public  HypoKontoErzeugungException(String kundename){
    super ("Kunde "+ kundename + "\nFür die Eröffnung eines Hypokontos muss ein Kontosaldo von sFr. 100'000.- vorliegen");
  }
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // Ende Methoden
} // end of HypoKontoErzeugungException
