/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public abstract class Konto {
  
  // Anfang Attribute
  protected String kontoArt;
  protected float  saldo;
  protected float  zinssatz;
  protected String kontoNummer;
  // Ende Attribute
  
  public Konto(String kontoNummer){
    this.kontoNummer = kontoNummer;
  }
  
  public Konto(String kontoNummer, float zinssatz){
    this(kontoNummer);
    this.zinssatz = zinssatz;
  }
  
  
  
  // Anfang Methoden
  public String getKontonummer(){
    return kontoNummer;
  }
  
  public String getKontoArt(){
    return  kontoArt;
  }
  
  public float getSaldo() {
    return saldo;
  }
  
  public float getZinssatz() {
    return zinssatz;
  }
  
  public void einzahlen(float betrag) {
    saldo += betrag;
  }
  
  public float beziehen(float betrag) throws BeziehenException {
	if (betrag < saldo)
      return saldo -= betrag;
	else
	  throw new BeziehenException(betrag, saldo);
  }
  
  public void setZinssatz(float zinssatz) {
    this.zinssatz = zinssatz;
  }
  
  public void zinsVerrechnung(){
    saldo += (saldo * zinssatz)/100;
  }
  
  // Ende Methoden
} // end of Konto
