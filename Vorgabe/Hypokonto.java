/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public class Hypokonto extends Konto {
  
  public Hypokonto(BankKunde kunde, String kontoNr, float betrag, float zinssatz)throws HypoKontoErzeugungException{
    super(kontoNr, zinssatz);
    //
    boolean saldoOK = false;
    for (int i=0; i<kunde.getAnzahlKonti(); i++) {
      if (kunde.getKundenKonto(i).getSaldo() > 100000.f) {
        saldoOK = true;
      } // end of if
    } // end of for
    if (saldoOK) {
      saldo    = betrag;
      kontoArt = "Hypokonto";
    } // end of if
    else
      throw new HypoKontoErzeugungException(kunde.getVorname());
  }
  
  public void amortisieren(float betrag){
    saldo -= betrag;
  }
  
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // Ende Methoden
} // end of Hypokonto
