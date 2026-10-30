
public class LA0004 
{
	public static void main(String[] args)
	{
		System.out.println(new LA0004().gaussDings(5));
		System.out.println("Mit Iteration: " + new LA0004().gaussIter(5));
	}
	
	int gaussDings(int a)
	{
		System.out.println(a);
		if(a!=0)
		{
			return a += gaussDings(a - 1);
		}
		else
		{
			return 0;
		}
	}
	
	int gaussIter(int a)
	{
		int tot = 0;
		for(int i = 0; i <= a; i++)
		{
			tot += i;
		}
		
		return tot;
	}
}
