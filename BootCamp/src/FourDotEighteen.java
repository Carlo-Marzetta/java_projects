
public class FourDotEighteen 
{
	public static void main(String[] args)
	{
		Integer[] numbers = new Integer[] {0, 0, 0, 0, 0, 0};
		
		for (int l = 0; l < 64; l++)
		{
			for (int o = 0; o <6; o++)
			{
				numbers[o] = 1;
				for(int i: numbers)
				{
					if(i == 0)
					{
							yin();
					}
					else
					{
						yang();
					}
				}
				numbers[o] = 0;
				System.out.println("||||||||||||||||||||||||||||||");
			}
			numbers[1] = 1;
		}
	}
	
	private static void yin ()
	{
		System.out.println("--  --");
	}
	private static void yang ()
	{
		System.out.println("------");
	}
}
