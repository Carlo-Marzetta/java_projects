import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BeziehenTest {
	
	/* Beim Bezug darf in der Regel nicht mehr abgehoben werden, als Saldo auf dem Konto
	 * verfügbar ist.
	 * Ausgenommen davon ist das Lohnkonto. Hier kann der Saldo auch negativ sein, wobei
	 * der Wert über die Methode setMaxNegativSaldo() gesetzt wird.
	 */
	
	static Lohnkonto k;
	
	@Before
	public void setUp() {
		k = new Lohnkonto("L007");
	}
	
	//Testfall 20
	// Es wird der Saldo auf 1000.- gesetzt und danach 500.- bezogen.
	@Test
	public void tetsFall_20() {
		try {
			k.einzahlen(1000.0f);
			k.beziehen(500.0f);
			assertEquals(k.getSaldo(), 500.0, 0.01f);
		}
		catch(BeziehenException e) {
			
		}
	}
	
	//Testfall 21
	// Es wird der Saldo auf 1000.- gesetzt und danach 5000.- bezogen. --> Exception wird ausgelöst
	@Test (expected = BeziehenException.class)
	public void testFall_21() throws BeziehenException{
		k.einzahlen(1000.0f);
		k.beziehen(5000.0f);
	}
	
	//Testfall 22
	// Es wird der Saldo auf 1000.- gesetzt und danach 1500.- bezogen, wobei ein Überzug von 1000.- festgelegt wird
	@Test
	public void testFall_22() {
		try {
			k.einzahlen(1000.0f);
			k.setMaxNegativSaldo(1000.0f);
			k.beziehen(1500.0f);
			assertEquals(k.getSaldo(), -500.0f, 0.01f );
		}
		catch(BeziehenException e) {
			
		}
	}
	
	//Testfall 23
	//Es wird der Saldo auf 1000.- mit einem Überzug von 1000.- gesetzt. Danach wird 2500.- bezogen --> Exception wird ausgelöst
	// do it

}
