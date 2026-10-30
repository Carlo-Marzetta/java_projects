import java.util.Scanner;


public class BinHexConverter 
{
	Scanner read = new Scanner(System.in);
	private short[] m_Bin = new short[] {1,1,1,1,1,1,1,1};
	private char[] m_Hex = new char[2];
	
	public static void main(String[] args)
	{
		new BinHexConverter().Start();
	}
	void Start()
	{
		int input; 
		input = read.nextInt();
	
		if(input > 255 || input < 0)
		{
			System.out.println("Fuk off boi");
			Start();
		}
		
		
		
		//BINARY CONVERSION
		m_Bin = toBin(input);

		for(int i = 0; i < 8; i++)
		{
			System.out.print(m_Bin[i]);
		}
		

		
		Integer hex = input;
		System.out.println("HEX: " + hex.toString(input, 16));
		
		
	}
	
	short[] toBin(int input)
	{
		short[] _Bin = new short[] {1,1,1,1,1,1,1,1};
		
		
		for(int ex = 7; ex >= 0; ex--)
		{
			if(input / Math.pow(2, ex) < 1)
			{
				_Bin[7-ex] = 0;
			}
			else
			{
				input -= Math.pow(2, ex);
			}
		}
		
		
		return _Bin;
	}
}
