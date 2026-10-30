import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;



public class RoemischeZahlen 
{

	static Terminal myTerminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
	static Key taste = null;
	static int m_currentLine = 4;
	static String m_input;
	
	
	
	 public static void main(String[] args) 
	 {
		    myTerminal.enterPrivateMode();
		    
		    askForNum();
	 }
	 
	 private static Integer askForNum()
	 {
		 
		    myTerminal.moveCursor(2, m_currentLine);
		    writeThisDown("Geben Sie eine Zahl ein");
		    m_currentLine++;
		    myTerminal.moveCursor(2, m_currentLine);
		    
		 
		 while (taste.getKind() != Kind.Enter)
		 {
		      	taste = myTerminal.readInput();
	      		char buchstabe = taste.getCharacter();

		      	String transition = null;
		      	transition += buchstabe;
	      		
		      	if(Character.isDigit(transition.charAt(0)))
		      	{

		      		m_input += buchstabe;
		      	}


		 }
	     int num = Integer.parseInt(m_input);
	     
	     return num;
	 }
	 
	 private static void writeThisDown (String _txt)
	 {
		 for (char c: _txt.toCharArray())
		 {
			 myTerminal.putCharacter(c);
		 }
	 }
}
