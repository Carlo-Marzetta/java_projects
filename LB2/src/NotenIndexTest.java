import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Executable;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;



//Für JUnit versionen ab 4.7
class NotenIndexTest {
	@Rule
	ExpectedException ex = ExpectedException.none();
	
	
	Fach f;
	
	
	@Test
	public void test5() throws NotenIndexException
	{

		try
		{
			f = new Fach();
			f.getNote(7);
		}
		catch(NotenIndexException  ex)
		{
			
		}
	}
	
	
	@Test
	void test6()
	{
		try
		{
			f = new Fach();
			f.addNote(0, 5.0f);
			assertEquals(f.getNote(0).getNotenwert(), 5.0f);
		}
		catch(NotenWertException | NotenAnzahlException | NotenIndexException ex)
		{
			assertEquals(1, 4);
		}
		

	}

}
