
public class Rekursion0002 
{
	public static void main(String[] args)
	{
		new Rekursion0002().rekursion(0, 6);
	}
	
	void rekursion(int a, int b)
	{
		a++;
		System.out.println(a);
		if(a!=b)
		{
			rekursion(a, b);
		}
		System.out.println(a);
	}
}
