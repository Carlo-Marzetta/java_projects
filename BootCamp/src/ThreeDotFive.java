import java.util.Scanner;
public class ThreeDotFive {
	
	public static void main(String[] args)
	{
		double input;
		double output;
		
		Scanner read = new Scanner(System.in);
		
		input = read.nextDouble();
		
		if (input % 2 == 0)
		{
			output = input;
			System.out.println(output);
		}
		

	}
}
