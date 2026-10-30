
public class FiveDotFourteen 
{
	public static void main(String[] args)
	{
		for(double i = 0; i < Double.MAX_VALUE; i++)
		{
			System.out.println();
			for (int e = 0; e < i; e++)
			{
				System.out.print(i);
			}
		}
	}
}
