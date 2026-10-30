
public class BlumenErbauer 
{
	public static void main(String[] args)
	{
		Blume blume;
		blume = new Blume();
		
		blume.setName("Wunderblume");
		
		blume.print();
		
		blume = null;
		
		blume.print();
	}
}
