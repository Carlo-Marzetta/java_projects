import java.util.Scanner;


public class ThreeDotEight 
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int x = read.nextInt();
    	
    	if (x < 100 && x > 0)
    	{
    		System.out.println(Integer.toBinaryString(x));
    	}
    }
}