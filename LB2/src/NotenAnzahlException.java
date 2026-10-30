
public class NotenAnzahlException extends Exception
{
	public NotenAnzahlException()
	{
		super("Zu viele Noteneinträge!\nEs können pro Fach maximal 5 Noten erfasst werden.");
	}
}
