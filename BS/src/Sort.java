import java.util.InputMismatchException;
import java.util.Scanner;
public class Sort 
{
	Scanner read = new Scanner(System.in);
	int[] toSort = new int[0];
	
	public static void main(String[] args)
	{
		new Sort().Start();
	}
	
	void Start()
	{
		GetInput();
		DecreasingSort();

		
		for(int i : toSort)
		{
			System.out.print(i + ", ");
		}
	}
	
	
	
	
	void HeadSort()
	{
		boolean toDo = true;
		while(toDo)
		{
			toDo = false;
			for(int i = 0; i < toSort.length - 1; i++)
			{
				if(toSort[i] > toSort[i+1])
				{
					int e = toSort[i];
					toSort[i] = toSort[i+1];
					toSort[i+1] = e;
					toDo = true;
				}
			}
			
		}
	}
	
	void FootSort()
	{
		boolean toDo = true;
		do
		{
			toDo = false;
			for(int i = 0; i < toSort.length - 1; i++)
			{
				if(toSort[i] > toSort[i+1])
				{
					int e = toSort[i];
					toSort[i] = toSort[i+1];
					toSort[i+1] = e;
					toDo = true;
				}
			}
			
		}
		while(toDo);
	}
	
	void DecreasingSort()
	{
		boolean toDo = true;
		while(toDo)
		{
			toDo = false;
			for(int i = 0; i < toSort.length - 1; i++)
			{
				if(toSort[i] < toSort[i+1])
				{
					int e = toSort[i];
					toSort[i] = toSort[i+1];
					toSort[i+1] = e;
					toDo = true;
				}
			}
			
		}
	}
	
	
	void GetInput()
	{
		String j = null;
		while(j != "sort")
		{
			System.out.print("> ");
			j = read.nextLine();
			
			try
			{
				int[]temp = toSort;
				toSort = new int[toSort.length + 1];
				for(int i = 0; i < temp.length; i++)
				{
					toSort[i] = temp[i];
				}
					toSort[toSort.length - 1] = Integer.parseInt(j);
			}
			catch(NumberFormatException ex)
			{
				j = "sort";
			}
		}
	}

}
