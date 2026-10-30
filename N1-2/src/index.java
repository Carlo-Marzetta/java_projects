
public class index 
{
	public static void main(String[] args)
	{
		IntegerModel model = new IntegerModel();
		InputView view = new InputView(model);
		new HEX_Output(model);
		new BIN_Output(model);
		new DEC_Output(model);
	}
}
