import java.util.Scanner;


public class FiveDotThree 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Rot >");
		String red = read.nextLine();
		System.out.print("Grün >");
		String green = read.nextLine();
		System.out.print("Blau >");
		String blue = read.nextLine();
		
		Long r = Long.parseLong(red, 16);
		Long g = Long.parseLong(green, 16);
		Long b = Long.parseLong(blue, 16);
		
		float myred = (float)r;
		float mygreen = (float)g;
		float myblue = (float)b;
		
		System.out.println("Red:" + myred/255 + "Green:" + mygreen/255 + "Blue" + myblue/255);
	}
}