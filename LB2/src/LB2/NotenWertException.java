
public class NotenWertException extends Exception
{
	public NotenWertException()
	{
		super("Ungültiger Notenwert!\nDer Notenwert muss im Bereich 1.0 bis 6.0 liegen.");
	}
}
