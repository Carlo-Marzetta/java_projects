
public class NotenIndexException extends Exception
{
	public NotenIndexException()
	{
		super("Ungültiger Indexwert!\nDer Indexwert ist negativ oder grösser als 5.");
	}
}
