
public class Fakultaet 
{
	
	public static void main(String[] args)
	{
		System.out.println(new Fakultaet().fakultaetRekursiv(5));
		System.out.println(new Fakultaet().fakultaetIter(5));
	}
	
	
	int fakultaetRekursiv(int a)
	{
		System.out.println(a);
		if(a!=0)
		{
			return a * fakultaetRekursiv(a - 1);
		}
		else
		{
			return 1;
		}
	}
	
		
	int fakultaetIter(int a)
	{
		int tot = 1;
		for(int i = 1; i <= a; i++)
		{
			tot *= i;
		}
		
		return tot;
	}
}
