import java.util.Scanner;
import java.util.ArrayList;

public class SixDotNine 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int[] zahlen = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		
		
		for(int e = 0; e < 9; e++)
		{
			
		}
		
		System.out.print("Anzahl Seiten >");
		int pages = read.nextInt();
		
		pages -= 4;
		
		for (int i = 1; i < pages; i++)
		{
			if (i < 10)
			{
				zahlen[i] ++;
			}
			else if (i < 100)
			{
				int e = i % 10;
				zahlen[e]++;
				int u = i / 10;
				zahlen[u]++;
			}
			else if (i < 1000)
			{
				int m = i % 10;
				zahlen[m]++;
				int o = i / 100;
				zahlen [o]++;
				int z = (i % 100) / 10;
				zahlen [z]++;
			}			
			else if (i < 10000)
			{
				int m = i % 10;
				zahlen[m]++;
				int o = i / 1000;
				zahlen [o]++;
				int z = (i % 100) / 10;
				zahlen [z]++;
				int d = (i % 1000) / 100;
				zahlen [d] ++;
			}
			
		}
		
		for (int a: zahlen)
		{
			System.out.println(a);
		}
		
		
		
		read.close();
	}
}
