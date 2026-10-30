import java.util.Scanner;


public class IPAddressConverter 
{
	Scanner read = new Scanner(System.in);
	String input;
	Integer[] m_Blocks = new Integer[4];
	
	public static void main(String[] args)
	{
		new IPAddressConverter().Start();
	}
	
	void Start()
	{
		System.out.print("IP-Address: ");
		input = read.nextLine();
		
		char[] _Input = input.toCharArray();
		
		String[] _Blocks = new String[] {"", "", "", ""};
		int blckCntr = 0;
		
		
		
		
		//____________________________________________________SPLIT__THE___INPUT___STRING__________________________
		for (int i = 0; i < _Input.length; i++)
		{
			if(_Input[i] != '.')
			{
				_Blocks[blckCntr] += _Input[i];
			}
			else
			{
				blckCntr ++;
			}
		}
		
		
		
		//____________________________________________________________CONVERSION________________________________________
		String[] _HexBlocks = new String[] {"", "", "",""};
		for (int i = 0; i < 4; i++)
		{
			m_Blocks[i] = Integer.parseInt(_Blocks[i]);
			_Blocks[i] = Integer.toBinaryString(m_Blocks[i]);
			_HexBlocks[i] = Integer.toHexString(m_Blocks[i]);
		}
		
		
		
		//________________________________________PRINT______________________________________________
		System.out.print("Binary: ");
		for (String s : _Blocks)
		{
			System.out.print(s + ".");
		}
		
		System.out.print("\nHexadecimal: ");
		for (String s : _HexBlocks)
		{
			System.out.print(s + ".");
		}
		
		
		
		
	}
}
