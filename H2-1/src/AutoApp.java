import java.util.*;
public class AutoApp 
{
	public static void main(String[] args)
	{
		String[] marken = new String[] {"Toyota", "VW", "Porsche", "Fiat"};
		String[] kennzeichen = new String[] {"ZH 666666", "GE 69696969", "BE 420420420", "TI 4206669"};
		Autoliste myList = new Autoliste();
		
		Auto jeff = new Auto("Jeffy", "JeffJeff");
		myList.addAuto(jeff);
		for(int i = 0; i < 4; i++)
		{
			Auto auto = new Auto(marken[i], kennzeichen[i]);
			myList.addAuto(auto);	
		}
		
		//print(myList);
		
		myList.removeAuto(3);
		
		//print(myList);
		
		myList.removeAuto(jeff);
		
	//	print(myList);
		myList.printListe();
	}
	
	/*public static void print(Autoliste liste)
	{
		for(int i = 0; i < liste.getSize(); i++)
		{
			System.out.println("Auto" + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
		}
		System.out.println("===========================================================");
		
		
	}**/
}
