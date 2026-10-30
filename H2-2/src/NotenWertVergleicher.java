import java.util.Comparator;

public class NotenWertVergleicher implements Comparator<Note>
{
	public int compare(Note n, Note n1)
	{
		float f = n.getNote() - n1.getNote();
		
		if(f < 0)
		{
			return -1;
		}
		else if (f == 0)
		{
			return 0;
		}
		else 
		{
			return 1;
		}
	}


}
