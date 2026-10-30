/**
   Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Auto implements AutoIF{
  
  // Deklaration der Attribute.
  // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels dem Typ
  //          FahrerIF sichergestellt.
  // Da ein Auto mehrer Fahrer kennt, verwenden wir hier einen Array auf
  // Fahrer-Objekte.
	
	private String nrSchild = "SG 999";
	private FahrerIF[] fahrer;
	private int cnt = 0;
  //....do it
  
  /**
  Initialisiert ein Auto-Objekt.
  Für die Zuordnung der Fahrre wird ein entsprechendes Array erstellt.
  */
  public Auto()
  {
    fahrer = new Fahrer[5]; // für 5 Fahrer begrenzt
    cnt = 0;
  }
  
  
  public String getNummerschild()
  {
	  return nrSchild;
  }
  
  public void setFahrerRef(FahrerIF fahrer)
  {
	  this.fahrer[cnt] = fahrer;
	  System.out.println("Fahrer: "+ (cnt + 1) +" "+this.fahrer[cnt].getName());
	  cnt++;
  }
  
  
  // Implementation der Schnitttselle AutoIF
  //....do it
  
  
  // Implemtation der erweiterten Schnittstelle der Klasse
  // Das sind Methoden die im Interface nicht genannt wurden.
  //....do it
  
}