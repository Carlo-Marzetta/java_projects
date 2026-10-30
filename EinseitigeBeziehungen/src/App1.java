/**
   Beispiel für die Instanzierung von Klassen, die eine 
   "einseitige" Beziehung pflegen.
   (Objekt A kennt Objekt B aber nicht umgekehrt)
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class App1{
  
  public static void main(String[] args){
    
    Haus haus;
    Hausbesitzer besitzer;
    
    haus = new Haus();
    
    besitzer = new Hausbesitzer(haus);
    	
    
    
    
    // gemäss Sequenzdiagramm die Instanzierung implementieren
    // ...do it
    
    
  }
  
}