import java.nio.charset.Charset;
 
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
 

/**
  * Beschreibe die Aufgabe dieses Programms
  * @author  Ibid umm
  * @date    04.04.2016
  * @version 1.0
  */

public class Sprache {
    // ------ Attribute ------
    static Terminal terminal;
    static TerminalSize terminalSize;
    
    /**
     * Hauptsteuerung
     * @param args
     */
    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();     
        terminalSize = terminal.getTerminalSize();
        
        terminal.moveCursor( 2, 9);
        terminal.putCharacter('H');
        
        //System.exit(0);
    }
}
