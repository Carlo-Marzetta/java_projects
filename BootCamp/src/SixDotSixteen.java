import java.util.ArrayList;
import java.util.Scanner;


public class SixDotSixteen 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		SixDotSixteen cls = new SixDotSixteen();
		
		System.out.print("Aktuelles Feld >");
		String start = read.nextLine();
		System.out.print("Gewünschtes Feld >");
		String end = read.nextLine();
		
		int x = cls.position(start).get(0);
		int y = cls.position(start).get(1);
		
		int endX = cls.position(end).get(0);
		int endY = cls.position(end).get(1);
		
		
		int[] toMove = new int[] {x-endX, y-endY};
		
		
		cls.calculateEverything();
		
		
		
		System.out.print(x + "  " + y + "  " + endX + "   " + endY);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private ArrayList<Integer> position (String pos)
	{
		
		String[] thePos = pos.split("(?!^)");
		
		switch (thePos[0])
		{
			case "a":
			thePos[0] = "1";
			break;
			
			case "b":
			thePos[0] = "2";
			break;
			
			case "c":
			thePos[0] = "3";
			break;
			
			case "d":
			thePos[0] = "4";
			break;
			
			case "e":
			thePos[0] = "5";
			break;
			
			case "f":
			thePos[0] = "6";
			break;
			
			case "g":
			thePos[0] = "7";
			break;
			
			case "h":
			thePos[0] = "8";
			break;
		}
		
		
		return convertToIntArray(thePos);
		
		
	}
	void calculateEverything() {}
	
	private ArrayList<Integer> convertToIntArray(String[] array)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(String i: array)
		{
			list.add(Integer.parseInt(i));
		}
		
		return list;
	}
}
