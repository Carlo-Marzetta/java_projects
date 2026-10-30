/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */
import java.util.*;

public class BankKunde {
  
  // Anfang Attribute
  
  private String name;
  private String vorname;
  private Vector<Konto> kundenKonti;
  // Ende Attribute
  
  public BankKunde(String name, String vorname) {
    this.kundenKonti = new Vector<Konto>();
    this.name = name;
    this.vorname = vorname;
  }
  
  // Anfang Methoden
  public String getName() {
    return name;
  }
  
  public String getVorname() {
    return vorname;
  }
  
  public String getVollenNamen(){
    return name + " " + vorname;
  }
  
  //
  public void addKundenKonto(Konto kundenKonto){
    kundenKonti.add(kundenKonto);
  }
  
  public Konto getKundenKonto(int kontoIndex){
    return kundenKonti.get(kontoIndex); 
  }
  
  public int getAnzahlKonti(){
    return  kundenKonti.size();
  }
  
  @Override
  public String toString(){
    String s = getVollenNamen() + "\n";   
    for (Konto konto : kundenKonti){
      s += konto.getKontoArt() + ": " + konto.getKontonummer() + "  -  sFr. " + konto.getSaldo() + ", Zinssatz " + konto.getZinssatz() + "\n";
    } // end of for
    s += "\n-----";
    return s;
  }
  
  // Ende Methoden
} // end of BankKunde
