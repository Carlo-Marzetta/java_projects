import java.util.Scanner;
import java.lang.reflect.Method;


public class ThreeDotNine 
{
	
	static String end = "";
	static double bitWorth;
	public static void main (String[] args)
	{

		Scanner read = new Scanner(System.in);
		String start = "";
		double number;
		
		System.out.println("Grössen: Bit, Byte, kB, KiB, MB, MiB, GB, GiB");
		System.out.print("Ausgangsgrösse >");
		start = read.nextLine();
		System.out.print("Endgrösse >");
		end = read.nextLine();
		System.out.print("Grösse >");
		number = read.nextDouble();
		
		java.lang.reflect.Method method;
	//	try 
	//	{
			Method startMethod =  ThreeDotNine.class.getMethod(start, Double.class);
			startMethod.invoke(number);
	//	} 
	//	catch (Exception ex)
	//	{
	//		System.out.print("Have I ever told you the definiton of insanity");
	//	}
		
		System.out.println(bitWorth);
		
		
	}
	
	private static void Bit(double num)
	{
		bitWorth = num;
	}
	
	private static void Byte(double num)
	{
		bitWorth = num * 8;
	}

	
	private static void kB(double num)
	{
		bitWorth = num * 8 * 1000;
	}

	
	private static void KiB(double num)
	{
		bitWorth = num * 8 * 1024;
	}

	
	private static void MB(double num)
	{
		bitWorth = num * 8 * 1000 * 1000;
	}

	
	private static void MiB(double num)
	{
		bitWorth = num * 8 * 1024 * 1024;
	}

	
	private static void GB(double num)
	{
		bitWorth = num * 8 * 1000 * 1000 * 1000;
	}
	
	
	private static void GiB(double num)
	{
		bitWorth = num * 8 * 1024 * 1024 * 1024;
	}



}
