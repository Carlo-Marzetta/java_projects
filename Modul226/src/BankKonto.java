public class BankKonto
{
	private float kontostand;
	private float aktZinssatz;
	private float maxUnterdeckung;
	private String besitzer;
	
	public static void main(String[] args)
	{
		BankKonto kontoLeer;
		BankKonto kontoX;
		BankKonto kontoMoritz;
		
		kontoLeer = new BankKonto();
		kontoLeer.zeigeKontoInfo();
		kontoX = new BankKonto(1000, 5);
		kontoX.zeigeKontoInfo();
		kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");
		kontoMoritz.zeigeKontoInfo();
		
	}
	
	
	
	public BankKonto()
	{
		kontostand = 0f;
		aktZinssatz = 0f;
		maxUnterdeckung = 0f;
		String besitzer = "null";
	}
	
	public BankKonto(float wert)
	{
		this();
		kontostand = wert;
	}
	
	public BankKonto (float wert, float zinssatz)
	{
		this(wert);
		aktZinssatz = zinssatz;
	}
	
	public BankKonto(float wert, float zinssatz, float deckung)
	{
		this(wert, zinssatz);
		maxUnterdeckung = deckung;
	}
	
	public BankKonto(float wert, float zinssatz, float deckung, String person)
	{
		this(wert, zinssatz, deckung);
		besitzer = person;
	}
	
	public void zeigeKontoInfo()
	{
		System.out.println("Besitzer: " + besitzer + "\nKontostand: " + kontostand + "\nCHF" + "\nZinssatz: " + aktZinssatz + "\n-------------------------------------------------------------------------\n");
	}
}

//Der Vorteil von kaskadierten Konstruktoren ist die Freiheit unterschiedlich viele Parameter anzugeben.