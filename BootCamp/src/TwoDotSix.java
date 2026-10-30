import java.util.Scanner;

public class TwoDotSix 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println("Zahl >");
		Double m_Zahl = read.nextDouble();
		System.out.println("Runden auf >");
		Double m_Runden = read.nextDouble();
		
		Double m_Gerundet = (double) Math.round((m_Zahl/m_Runden));
		System.out.println(m_Gerundet * m_Runden);
	}
}
