/**  Datei: Punkt.java
 Deklaration der Klasse Punkt. Dem Compiler wird gesagt, dass es
 eine Klasse Punkt gibt.

 Hier die Metadaten angeben wie Author, VErsion, Datum usw.
 Dann wird die Kalsse als Ganzes beschrieben. Was macht das Objekt,
 auf was muss man achten usw.
 */
public class Punkt
{
  private int x; /** Datenfelder für die x- und @whackdonalds*/
  private int y; /** y-Koordinate vom Typ int*/
  
  /**  Dies ist die GetMethode für x
   @return x
   * */
  public int getX() /** eine Methode, um den Wert*/
  {  
    return x;
  }
  /** Dies ist die Get Methode für y
   * @return y-Position
   */
  public int getY() 
  {  
    return y;
  }
  /** Dies ist die Set Methode für x
   * @param x
   */
  public void setX (int i)
  { 
    x = i;
  }
  /** Dies ist die Set Methode für y
   * @param y
   */
  public void setY (int i)
  { 
    y = i;
  }

  public static void main (String[] args)
  {
    Punkt p = new Punkt();
    p.setX (3);
    p.setY (2); 
    System.out.println ("Die Koordinaten des Punktes p sind: ");
    System.out.println (p.getX()); /** Wert von x wird ausgegeben*/
    System.out.println (p.getY()); /** Wert von y wird ausgegeben*/
  }
}