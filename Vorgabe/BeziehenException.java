
public class BeziehenException extends Exception {
	public BeziehenException(float betrag, float saldo) {
		super("Der Betrag "+betrag + " kann nicht bezogen werden. Der Saldo ist zu klein. Saldo = " + saldo);
	}
}
