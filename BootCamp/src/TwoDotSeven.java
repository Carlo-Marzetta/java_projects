import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;


public class TwoDotSeven 
{
	public static void main(String[] args)
	{
		
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println("Gib Nummer ein >");
		Double n = read.nextDouble();
		
		Double d = n.doubleValue();
		System.out.println(df.format(d));
	}
}
