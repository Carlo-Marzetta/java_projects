/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public class Lohnkonto extends Konto {
  
  // Anfang Attribute
  private float maxNegativSaldo;
  // Ende Attribute
  
  
  public Lohnkonto(String kontoNummer){
    super(kontoNummer);
    kontoArt = "Lohnkonto";
  }
  
  public Lohnkonto(String kontoNummer, float zinssatz){
    super(kontoNummer, zinssatz);
    kontoArt = "Lohnkonto";
  }
  
  public Lohnkonto(String kontoNummer, float zinssatz, float maxNegativSaldo){
    this(kontoNummer, zinssatz);
    this.maxNegativSaldo = maxNegativSaldo;
  }
  
  
  
  // Anfang Methoden
  public float getMaxNegativSaldo() {
    return maxNegativSaldo;
  }
  
  public void setMaxNegativSaldo(float negativSaldo){
    maxNegativSaldo = negativSaldo;
  }
  
  @Override
  public float beziehen(float betrag) throws BeziehenException 
  {
	  if(saldo + maxNegativSaldo > betrag)
	  {
		  return saldo -= betrag; 
	  }
	  else
	  {
		  throw new BeziehenException(betrag, saldo);
	  }
  }
  
  // Ende Methoden
} // end of Lohnkonto
