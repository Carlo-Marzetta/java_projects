import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Square extends JPanel {
	private Color _color;
	private ChessFigureIF _occupant;
	private int _squareID;
	
	Square(Color c, int id)
	{
		_squareID = id;
		_color = c;
	}
	
	public void setCurrentFigure(ChessFigureIF cf) 
	{
		_occupant = cf;
	}
	
	public ChessFigureIF getCurrentFigure() 
	{
		return _occupant;
	}
	
	public HashMap getData()
	{
		HashMap<String, Object> data = new HashMap();
		
		data.put("color", _color);
		//data.put("figure", _occupant);
		
		return data;
	}
}
