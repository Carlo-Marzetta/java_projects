import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

//Für JUnit versionen ab 4.7
class NotenAnzahlTest {
	@Rule
	ExpectedException ex = ExpectedException.none();
	
	Fach f;

	
	@Test
	void test()
	{
		f = new Fach("Inf");
		ex.expect(NotenAnzahlException.class);
		for (int i = 0; i<6; i++)
		{
				try 
				{
					f.addNote(i, 5.0f);
				} 
				
				catch (NotenAnzahlException | NotenWertException e) 
				{
					assertEquals(e.getClass(), NotenAnzahlException.class);
				}
		}
	}

}
