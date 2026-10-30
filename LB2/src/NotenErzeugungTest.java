import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

// Für JUnit versionen ab 4.7
class NotenErzeugungTest {
	@Rule
	ExpectedException ex = ExpectedException.none();
	
	Note n;

	
	
	@Test
	void test()
	{
		ex.expect(NotenWertException.class);
		try
		{
			n = new Note(0, 0.5f);
		} 
		
		catch (NotenWertException e) 
		{
			assertEquals(n, null);
		}
	}
	
	
	@Test
	void test1() throws NotenWertException
	{
		ex.expect(NotenWertException.class);
		try
		{
			n = new Note(0, 6.5f);
		}
		catch(NotenWertException ex)
		{
			assertEquals(n, null);
		}
	}
	
	@Test
	void test2() throws NotenWertException
	{
		n = new Note(0, 5.0f);
		
		assertNotNull(n);
	}
}
