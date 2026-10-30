import java.util.*;

public class ArrayDemo{
  
  public static final int MAX_STELLEN = 5;   /* später für JUNit-Test benötigt */
  private Vector<Float> noten;

  
  
  public ArrayDemo(){
    noten = new Vector<Float>(MAX_STELLEN);

  }
  
  /*
  Die hier programmierten Methoden "schützen" den Array nicht
  vor falscher Indexierung. Somit ist die fehlerfreie Ausführung
  des Programms nicht gewährleitet.
  
  Durch den Einbau von Exceptionhanlder soll die Software wieder
  in einen betriebssicheren Zustand gebracht werden.
  
  */
  
  public void addWert(float note) throws NotenBereichException
  {
	  if(note < 1 || note > 6)
	  {
		  throw new NotenBereichException();
	  }
	  else
	  {
		noten.add(note);
	  }

  }
  
  
  public int getMaxGroesse(){
    return MAX_STELLEN;
  }
  
  public int getAnzahlElemente(){
    return noten.size();
  }
  
  public float getNote(int index){
    return noten.get(index);
  }
  
  public void removeWert(int index){
    noten.remove(index);
  }
  
  public void print(){
    for (int i=0; i < noten.size(); i++) {
      System.out.println(i+1 + ". Note: "+noten.get(i));
    } // end of for
  }
  
  
  public static void main(String[] args){
    ArrayDemo demo = new ArrayDemo();
    try
    {
	    demo.addWert(4.5f);
	    demo.addWert(5.0f);
	    demo.addWert(3.5f);
	    demo.addWert(4.0f);
	    demo.addWert(4.5f);
	    demo.addWert(7.5f);
	    demo.print();
    }
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.print("Too many demos"+ ex.getMessage());
	}
    catch(NotenBereichException ex)
    {
    	System.out.print(ex.getMessage());
    }
    //
    System.out.println("\n\nLösche Wert an 2. Stelle");
    demo.removeWert(1);
    demo.print();

    System.out.print("\n\n8. Note = ");
    try
    {
    	System.out.println(demo.getNote(8));
    }
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.print("LOL: " + ex.getMessage());
	}
    
    
    //
    System.out.println("\n\nArray umfasst zur Zeit "+demo.getAnzahlElemente()+" Elemente");
    System.out.println("Wert an 3. Stelle ist "+demo.getNote(2));
    System.out.println("Grösse des Array ist "+demo.getMaxGroesse());
    System.out.println("=====================================================");
    demo.print();    
  }
}