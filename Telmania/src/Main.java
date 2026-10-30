
import ch.it.bzz.telegraph.Connection;
import ch.it.bzz.telegraph.Network;
import java.util.Scanner;


// Telmania
//Carlo Marzetta HIMS17b
//3/7/2018
//v1.1




public class Main 
{
	
	 static Scanner read = new Scanner(System.in);
	 
	 static Network m_Network = new Network();
	 static Connection m_Connection = new Connection();
	 
	 static String m_Start;
	 static String m_End;
	 static String m_Knots = "ABCDEFGHIJKLMNO";
	 
	 static boolean m_WegBesteht;
	 static boolean m_WegZuKurz;
	 
	 
	 
	 public static void main(String[] args) 
	 { 
		 ShowAll();
		 Abfragen();
		 RouteBerechnen(m_WegZuKurz);
		 Ausgabe(m_WegZuKurz);
	 }
	 
	 //fragt a & b ab
	 private static void Abfragen ()
	 {
		 String m_input;
		 boolean _AC = false;
		 boolean _BC = false;
		 
		 
		 
		 //Startpunkt abfragen	
		 System.out.println("Geben Sie bitte den Startpunkt ein.>");
		 
		 while (_AC == false)
		 {
			 m_input = read.nextLine();
			 
			 if (m_input.length() == 1 && m_Knots.contains(m_input))
			 {
				 m_Start = m_input;
				 _AC = true;
			 }
			 else
			 {
				 System.out.println("Bitte geben Sie eine gültige Option ein.>");
			 }
		 }
		 
		 
		 //Destination abfragen
		 System.out.println("Bitte geben Sie ihre Destination ein.>");
		 while (_BC == false)
		 {
			 m_input = read.nextLine();
			 
			 if (m_input.length() == 1 && m_Knots.contains(m_input))
			 {
				 m_End = m_input;
				 _BC = true;
			 }
			 else
			 {
				 System.out.println("Bitte geben Sie eine gültige Option ein.>");
			 }
		 }
		 
		 //überprüft ob Destination und Start das gleiche sind
		 if(m_Start.equals(m_End))
		 {
			 m_WegZuKurz = true;
		 }
		 else
		 {
			 m_WegZuKurz = false;
		 }
	 }
	 
	 //Berechnet Route
	 private static void RouteBerechnen(boolean _sinnlos)
	 {
		 if(_sinnlos != true)
		 {
			 //überprüft, ob weg besteht
			 try
			 {
				 m_Connection = m_Network.findConnection(m_Start, m_End);
				 String test = m_Connection.getPath();
				 m_WegBesteht = true;
	
			 }
			 catch(NullPointerException m_Connection)
			 {
				 m_WegBesteht = false;
			 }
		 }
		 else
		 {
			 
		 }
	 }
	 
	 
	 //Gibt Resultate aus
	 private static void Ausgabe(boolean _sinnlos)
	 {
		 if(_sinnlos != true)
		 {
			 if(m_WegBesteht == true)
			 {
				 System.out.println(m_Connection.getPath());
				 System.out.println(m_Connection.getTime());
			 }
			 else
			 {
				 System.out.println("Der gesuchte Weg existiert nicht.");
			 }
		 }
		 else
		 {
			 System.out.println("Startpunkt und Destination dürfen nicht dasselbe sein.");
		 }
	 }
	 
	 
	 private static void ShowAll ()
	 {
		 
		 String[] m_Net1Start;
		 String[] m_Net1End;
		 String[] m_Net2Start;
		 String[] m_Net2End;
		
		 
		 m_Net1Start = new String[]{"A", "B", "C", "D", "E", "F", "G"};
		 m_Net1End = new String[]{"A", "B", "C", "D", "E", "F", "G"};
		 
		 m_Net2Start =  new String[]{"H", "I", "J", "K", "L", "M", "N", "O"};
		 m_Net2End =  new String[]{"H", "I", "J", "K", "L", "M", "N", "O"};
		 

		 
		 for(String _Point: m_Net1Start)
		 {
			 for (String _End: m_Net1End)
			 {
				 System.out.println(_Point + " - " + _End);
			 }
		 }
		 
		 for(String _Point: m_Net2Start)
		 {
			 for (String _End: m_Net2End)
			 {
				 System.out.println(_Point + " - " + _End);
			 }
		 }
		 
	 }

	 
}	
