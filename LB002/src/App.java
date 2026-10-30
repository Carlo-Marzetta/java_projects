
public class App 
{
	public static void main(String[] args)
	{
		DestinationModel dm = new DestinationModel();
		dm.toString();
		
		InputGUI i = new InputGUI(dm);
		UserGUI u = new UserGUI(dm);
	}
}
