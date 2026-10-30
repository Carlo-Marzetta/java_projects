/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public class Sparkonto extends Konto {
  
  // Anfang Attribute
  private float erhoehterZinssatz;
  // Ende Attribute
  
  public Sparkonto(String kontoNummer){
    super(kontoNummer);
    kontoArt = "Sparkonto";
  }
  
  public Sparkonto(String kontoNummer, float zinssatz){
    super(kontoNummer, zinssatz);
    kontoArt = "Sparkonto";
  }
  
  public Sparkonto(String kontoNummer, float zinssatz, float erhoehterZinssatz) throws ErhoeterZinsasatzException{
    super(kontoNummer, zinssatz);
    setErhoeterZinssatz(erhoehterZinssatz);
    kontoArt = "Sparkonto";
  }
  
  
  // Anfang Methoden
  public void setErhoeterZinssatz(float zinssatz) throws ErhoeterZinsasatzException
  {
	  if(saldo > 100000.0)
	  {
		  this.zinssatz = zinssatz;
	  }
	  else
	  {
		  throw new ErhoeterZinsasatzException();
	  }
  }
  
  
  @Override
  public void zinsVerrechnung(){
    saldo += (saldo * erhoehterZinssatz)/100;
  }
  
  // Ende Methoden
} // end of Sparkonto
