
public class SortierDingsDa 
{

	
	public static void main(String[] args)
	{
		
		int[] a;
		a = new int[] {43, 60, 10, 80, 42, 72, 15, 8, 67};
		
		new SortierDingsDa().Sort(a);
	}
	
	
	void Sort(int[] a)
	{
		for(int n = 1; n < a.length; n++)
		{
			int x = a[n];
			int s = 0;
			
			while(a[s]>x)
			{
				s++;
			}
			
			int t = n;
			
			while(t>s)
			{
				a[t] = a[t-1];
				t--;
			}
			a[s] = x;
			
			for(int e : a)
			{
				System.out.print(e + ", ");
			}
			
			System.out.println("\n-----------------\n");
		}
	}
}
