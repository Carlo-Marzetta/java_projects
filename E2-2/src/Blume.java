import java.awt.Color;

public class Blume 
{
	private Wurzel wurzel;


	private final int MAXSIZE = 3;
	
	private Bluete[] blueten = new Bluete[MAXSIZE];
	private String name;

	private Color RED = new Color(255, 0, 0);
	private Color GREEN = new Color(0, 255, 0);
	private Color BLUE = new Color(0, 0, 255);
	
	
	private Color[] colors =  {RED, BLUE, GREEN};
	
	
	Blume()
	{
		wurzel = new Wurzel("Tiefwurzel");
		
		for (int i = 0; i < MAXSIZE; i++)
		{
			blueten[i] = new Bluete(colors[i]);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("Blume: - Name " + name + "\n - Wurzel: " + wurzel.getTyp());
		
		for(int i = 0; i < MAXSIZE; i++)
		{
			System.out.println("- " + (i + 1) + ". Bluete " + blueten[i].getFarbe());
		}
	}
	
}
