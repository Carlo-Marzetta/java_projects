import java.util.Scanner;


public class FiveDotTwo 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Rot (0.0 - 1.0) >");
		float red = read.nextFloat();
		System.out.print("Grün (0.0 - 1.0) >");
		float green = read.nextFloat();
		System.out.print("Blau (0.0 - 1.0) >");
		float blue = read.nextFloat();
		
		int b = (int)(blue * 255);
		int g = (int)(green * 255);
		int r = (int)(red * 255);
		
		
		String myBlue = convert(b);
		String myGreen = convert(g);
		String myRed = convert(r);
		
		System.out.println(myRed + myGreen + myBlue);
	}
	
	public static String convert(int n) 
	{
		return Integer.toHexString(n);
	}

}
