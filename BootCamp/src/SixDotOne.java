
public class SixDotOne 
{
	public static void main(String[] args)
	{
		int[] myArray = new int[] {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
		
		System.out.println("Sum:" + sum(myArray) + "\nProduct: " + multiply(myArray));
		
	}
	
	private static int sum (int[] numbers)
	{
		int all = 0;
		
		for(int i: numbers)
		{
			all += i;
		}
		
		return all;
	}
	
	private static double multiply (int[] numbers)
	{
		double all = 1;
		
		for(int i: numbers)
		{
			all = all * i;
		}
		
		return all;
	}
}
