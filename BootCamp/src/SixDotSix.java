import java.util.ArrayList;

public class SixDotSix 
{
	public static void main(String[] args)
	{

		int[] myNums = new int[]  {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
		
		System.out.println(umkehren(myNums));
	}
	
	private static ArrayList<Integer> umkehren (int[] zumUmkehren)
	{
		ArrayList<Integer> umgekehrtes = new ArrayList<Integer>();
		
		for (int i = 1; i < zumUmkehren.length; i++)
		{
			umgekehrtes.add(zumUmkehren[(zumUmkehren.length - i)]);
		}
		
		return umgekehrtes;
	}
}
