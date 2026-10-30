import java.util.Scanner;


public class TwoDotEight 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Stunden >");
		Double m_H = read.nextDouble();
		
		System.out.print("Minuten >");
		float m_Min = read.nextFloat();
		
		System.out.print("Sekunden >");
		float m_S = read.nextFloat();
		
		m_Min += m_S/60;
		m_H += m_Min/60;
		System.out.println(m_H);
	}
}
