import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ErhoeterZinssatzTest {
	
	/* Ein erhöhter Zinssatz wird gewährt, wenn das Sparkonto mehr als sFr. 100'000 enthält.
	 * 
	 * Die Tests sind korrekt! Der Fehler liegt im Code der Kalsse Sparkonto.
	 */
	static Sparkonto s;
	
	@Before
	public void setUp() {
		s = new Sparkonto("S001", 2.0f);
	}
	
	//Testfall 10 
	// Das Konto wird mit sFr. 1'000.- versehen und danach der erhöhte Zinssatz gesetzt --> Exception wird geworfen
	@Test (expected = ErhoeterZinsasatzException.class)
	public void testFall_10() throws ErhoeterZinsasatzException{
		s.einzahlen(1000.0f);
		s.setErhoeterZinssatz(5.0f);
	}
	
	//Testfall 11
	// Das Konto wird mit 150'000 versehen --> der erhöhte Zinssatz ist gesetzt
	@Test
	public void testFall_11() {
		try {
			s.einzahlen(150000.0f);
			s.setErhoeterZinssatz(5.0f);
			assertEquals(s.getZinssatz(), 5.0f, 0.001f);
		}
		catch(ErhoeterZinsasatzException e) {
			
		}
	}
	
	//Testfall 12
	// Das Konto wird mit 1'000.- versehen, der Zinssatz entspricht dem reduzierten Satz
	@Test
	public void testFall_12() {
		try {
			s.einzahlen(1000.0f);
			s.setErhoeterZinssatz(5.0f);
		}
		catch(ErhoeterZinsasatzException e) {
			
		}
		finally{
			assertEquals(s.getZinssatz(), 2.0f, 0.001f);
		}
	}

}
