import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class RechnerTest {

	
	Rechner calc;
	@Before
	void leul()
	{
		calc = new Rechner();
	}
	
	
	@Test
	void test() throws DivideException
	{
			assertEquals(calc.divide(10f, 10f), 1f);

	}
	
	
	@Test
	void lol() throws DivideException
	{
		assertEquals(calc.divide('a', 97f), 1f);
	}

	DivideException exx = new DivideException();
	@Test
	void lel() throws DivideException 
	{
		try
		{
			calc.divide(13f, 0f);
		}
		catch(DivideException ex)
		{
			assertEquals(ex.getMessage(), exx.getMessage());
		}
	}
	
	
	@Test
	void lil() throws DivideException
	{
		assertNotSame(calc.divide(123f, 123f), 5f);
	}
	
	@Test(expected = DivideException.class)
	void lul ()
	{
		calc.divide(3f, 0f);
	}
	

}
