import java.util.ArrayList;

public abstract class ChessFigureIF 
{
	public boolean _white = false;
	public int _position = 0;

	ChessFigureIF (boolean isWhite, int pos)
	{
		_white = isWhite;
		_position = pos;
	}

	public void moveTo(int where) 
	{
		// notify listeners
		
		_position = where;
	}
	
	public ArrayList possiblePositions()
	{
		return null;
	}
	
	public void die() {}
}
