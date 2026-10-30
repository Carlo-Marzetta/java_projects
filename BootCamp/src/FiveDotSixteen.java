
public class FiveDotSixteen 
{
	public static void main(String[] args)
	{
		FiveDotSixteen jeff = new FiveDotSixteen();
		
		jeff.top();
	}
	
	void top ()
	{
		int x = 1;

		g(f(x));
	}
	
	int f(int x)
	{
		x = 7;
		return x;
	}
	
	void g(int x)
	{
		System.out.println(x);
	}
}
