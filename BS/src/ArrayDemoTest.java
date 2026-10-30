import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ArrayDemoTest {

	ArrayDemo demo;
	
	
	@Before
	public void setUp()
	{
		demo = new ArrayDemo();
	}
	
	@Test
	public void testGroesse()
	{
		//assertEquals(demo.MAX_STELLEN, 5);
		assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
	}
	
	
	@Test
	public void testAnzElemente()
	{
		
	}
	
	
	@Test
	void lal() 
	{
		try
		{
			demo.addWert(5f);
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			assertEquals(demo.getAnzahlElemente(), 1);
		}
		
		
	}
	
	
	@Test
	void luel ()
	{
		System.out.print(demo.getMaxGroesse() + "JEFF");
	}
}
