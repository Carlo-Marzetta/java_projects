import java.util.Random;
public class SelectionSort 
{
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] lol = new int[10000];
		for(int i : lol)
		{
			i = rand.nextInt((100000 - 1) + 1) + 1;
		}
		
		for(int i: new SelectionSort().sortArray(lol))
		{
			System.out.println(i);
		}
	}
	
	
	
	public int[] sortArray(int[] _list)
	{
		int[] _newList = _list;
		
		for(int i = 0; i < _list.length; i++)
		{
			for(int j = i; j < _list.length; j++)
			{
				if(_list[j] < _newList[i])
				{
					int temp = _newList[i];
					_newList[i] = _list[j];
					_list[j] = temp;
				}
			}
		}
		return _newList;
	}
	
	
	public int[] sortArrayHead(int[] _list)
	{
		int i = 0;
		int[] _newList = _list;
		while(i != _list.length)
		{
			int j = i;
			while(j != _list.length)
			{
				if(_list[j] < _newList[i])
				{
					int temp = _newList[i];
					_newList[i] = _list[j];
					_list[j] = temp;
				}
			}
		}
		return _newList;
	}
	
	public int[] sortArrayFoot(int[] _list)
	{
		int i = 0;
		int[] _newList = _list;
		do
		{
			int j = i;
			do
			{
				if(_list[j] < _newList[i])
				{
					int temp = _newList[i];
					_newList[i] = _list[j];
					_list[j] = temp;
				}
			}
			while(j != _list.length);

		}	
		while(i != _list.length);
	
		return _newList;
	}
}
