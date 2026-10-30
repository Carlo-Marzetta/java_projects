
public class PersonenVerwaltung {
	
	public static void main(String[] args)
	{
		Mitarbeiter max;
		max = new Mitarbeiter("Max Xam", 21, 12, "066 666 66 66", 1200f);
		
		Stammkunde sk;
		sk = new Stammkunde("Heinz Voldemord", 24, max, 20f);
		
		
		
		System.out.print(sk.kontakt.getName());
	}
}
