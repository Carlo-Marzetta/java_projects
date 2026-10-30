import java.util.Scanner;

public class FiveDotFour 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Zahl: >");
		int num = read.nextInt();
		
		int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
	}
}
