import java.util.*;
import java.util.Comparator;

public class NotenDatumVergleicher implements Comparator<Note>
{
	public int compare(Note n, Note n1)
	{
		return n.getDatum().compareTo(n1.getDatum());
	}
}
