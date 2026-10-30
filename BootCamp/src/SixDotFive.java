import java.util.ArrayList;

public class SixDotFive 
{
	public static void main(String[] args)
	{

		int[] myNums = new int[]  {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
		
		ArrayList<Integer> otherNumber = new ArrayList<Integer>();
		

		for(int e: myNums)
		{
			if(!otherNumber.contains(e))
			{
				otherNumber.add(e);
			}
		}
		
		
		for(int a: otherNumber)
		{
			System.out.println(a);
		}
	}
}
