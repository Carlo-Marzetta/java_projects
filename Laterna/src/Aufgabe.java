
import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;

public class Aufgabe {
	
	static Terminal terminal;
    static TerminalSize terminalSize;
	
	 public static void main(String[] args) 
	 {
		 
		 
		//Terminal erstellen
		Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
	    terminal.enterPrivateMode();
	    terminalSize = terminal.getTerminalSize();
	   
	    //Cursorposition angeben
	    terminal.moveCursor(2, 9);
	    
	    //Ausgabe
	    for (char c: "WTF".toCharArray()) 
	    {
	    	terminal.putCharacter(c);
	    }
	    
	    //Cursorposition angeben
	    terminal.moveCursor(18, 9);
	    
	    //Variable für Eingabe erstellen
        Key taste = null;
	    
	    //Liest eine Eingabe
	    while (taste == null) 
	    {
            taste = terminal.readInput();
        }
	    
	    //Holt das eingegebene Zeichen und stellt sie dar
        char buchstabe = taste.getCharacter();
        terminal.putCharacter(buchstabe);
        
        if (buchstabe == 'D')
        {
 
            terminal.moveCursor(2, 11);
            for (char c : "Deutsch".toCharArray()) 
            {
                terminal.putCharacter(c);
            }
 
        } else if (buchstabe == 'E') {
            for (char c : "English".toCharArray()) 
            {
                terminal.putCharacter(c);
            }
        } else {
            // sonst
            for (char c : "Ungültige Eingabe!".toCharArray()) 
            {
                terminal.putCharacter(c);
            }
        }
 
        //Cursorposition angeben
        terminal.moveCursor(2, 15);
        	
        //Variable für Eingabe auf 'null' setzen
        taste = null;
	    
        //Liest eine Eingabe
        while (taste == null) 
        {
            taste = terminal.readInput();
        }
        //Eingabe (ein Zeichen)
        System.exit(0);
	 }
}