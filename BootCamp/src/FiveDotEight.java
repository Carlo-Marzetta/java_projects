import java.util.Scanner;


public class FiveDotEight 
{
	public static void main(String[] args)
	{
		
		Scanner read = new Scanner(System.in);
		System.out.print("Erste Zahl: >");
		double num1 = read.nextDouble();
		System.out.print("Zweite Zahl: >");
		double num2 = read.nextDouble();
		
		System.out.print(ggT(num1, num2));
		
	}
	
	private static double ggT (double _n1, double _n2)
	{
		double r = 1;
		
		while (r > 0)
		{
			r = _n1 % _n2;
			_n1 = _n2;
			_n2 = r;
		}
		
		return _n1;
	}
}
