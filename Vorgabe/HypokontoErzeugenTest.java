import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HypokontoErzeugenTest {
  
  /* Ein Objekt Hypokonto darf nur erzeugt werden, wenn der Kunde
  ein Konto mit mindestens sFr. 100'000.- besitzt.
  *
  */
  static BankKunde k;
  
  @Before
  public void setUp() {
    k = new BankKunde("Meier", "Max");
  }
  
  //Testfall 1
  // Der Kunde hat ein Konto mit zu geringem Betrag --> Exception wird geworfen
  @Test(expected = HypoKontoErzeugungException.class)
  public void testFall_1() throws HypoKontoErzeugungException{
    Sparkonto sk = new Sparkonto("S1", 0.8f);
    sk.einzahlen(1000.0f);
    k.addKundenKonto(sk);
    Hypokonto hk = new Hypokonto(k, "H1", 500000.0f, 5.0f);
  }
  
  //Testfall 2
  // Der Kunde hat ein Konto mit genügendem Betrag --> keine Exception, Objekt ist verfügbar
  @Test
  public void testFall_2() throws HypoKontoErzeugungException
  {
	  Sparkonto s = new Sparkonto("S1", 1f);
	  s.einzahlen(500000f);
	  k.addKundenKonto(s);
	  Hypokonto hk = new Hypokonto(k, "H1", 500000.0f, 5.0f);
  }
  
  
  //Testfall 3
  // Der Kunde hat noch gar kein weiteres Konto --> Exception wird geworfen
  @Test(expected = HypoKontoErzeugungException.class)
  public void testFall_3() throws HypoKontoErzeugungException
  {
	  Hypokonto hk = new Hypokonto(k, "H2", 100f, 5f);
  }
}
