/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.01.2019
  * @author 
  */

public class BankApp {
  
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  public static void main(String[] args) {
    String bankName    = "MeineSchulBank";
    BankKunde kunden[] = new BankKunde[2];
    int kundenCntr     = 0;
    
    // hier Kunden und Konti dazu aufbauen
    BankKunde maxMeier    = new BankKunde("Meier", "Max");
    BankKunde ritaMueller = new BankKunde("Mueller", "Rita");
    kunden[kundenCntr++]  = maxMeier;
    kunden[kundenCntr++]  = ritaMueller;
    //
    try{
      
      maxMeier.addKundenKonto(new Sparkonto("C34-445",2.1f, 3.1f));
      maxMeier.getKundenKonto(0).einzahlen(150000.0f);          
      maxMeier.addKundenKonto(new Sparkonto("C34-378",1.5f, 3.1f));
      maxMeier.getKundenKonto(1).einzahlen(2000.0f);  
      maxMeier.addKundenKonto(new Hypokonto(maxMeier, "H01-F45", 300000.0f, 2.8f));
      
      ritaMueller.addKundenKonto(new Sparkonto ("X22-776", 1.8f, 3.1f));
      ritaMueller.getKundenKonto(0).einzahlen(22500.0f);
      ritaMueller.addKundenKonto(new Lohnkonto ("RA33-776", 0.5f));
      ritaMueller.getKundenKonto(1).einzahlen(3000.0f);
      ritaMueller.addKundenKonto(new Hypokonto(ritaMueller, "H99-F32", 250000.0f, 3.2f));  
    }
    catch(HypoKontoErzeugungException ex){
      System.out.println(ex.getMessage());
    }
    catch(ErhoeterZinsasatzException ex) {
    	System.out.println(ex.getMessage());
    }
    
    
    // hier die Daten zum Testen ausgeben
    System.out.println("\n\nBank: "+bankName);
    System.out.println("------.....................");
    System.out.println("Kunden: \t" + kunden[0].getVollenNamen() +"\n\t\t"+ kunden[1].getVollenNamen());
    System.out.println("=========================================");
    for (int i=0; i < kunden.length; i++) {
      System.out.println(kunden[i]);
    } // end of for
    
    // hier noch ein paar Fehlerfälle provozieren
    try{
      
    }
    catch(Exception e){
      
    }
  }
  
  // Ende Methoden
} // end of BankApp
