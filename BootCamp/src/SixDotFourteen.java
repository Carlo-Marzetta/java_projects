
public class SixDotFourteen 
{
	public static void main(String[] args)
	{
		int[] myArray = new int[] {-1, 2, -6, -14, 15, 12, -5, 0, 6, -6, 11, -4, -7, 1, -5, 1};
		
		int summe = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			if(myArray[i] + summe > summe)
			{
				summe += myArray[i];
			}
		}
		
		System.out.println(summe);
	}
}
