import java.util.ArrayList;
import java.util.Collections;

public class SixDotFour 
{
	public static void main(String[] args)
	{

		int[] myNums = new int[]  {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};		
		
		
		System.out.println(filter(myNums));
		
	}
	
	private static ArrayList<Integer> filter (int[] nums)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i: nums)
		{
			numbers.add(i);
		}
		
		numbers.remove(Collections.max(numbers));
		numbers.remove(Collections.max(numbers));
		numbers.remove(Collections.min(numbers));
		
		return numbers;
		
	}
}
