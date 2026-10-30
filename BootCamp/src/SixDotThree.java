import java.util.ArrayList;

public class SixDotThree 
{
	public static void main(String[] args)
	{
		int[] numbers = new int[] {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
		
		ArrayList<Integer> higher = new ArrayList<Integer>();
		for (int i: numbers)
		{
			if(i > 10)
			{
				higher.add(i);
			}
		}
	}
}
