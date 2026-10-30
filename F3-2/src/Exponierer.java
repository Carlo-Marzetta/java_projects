
public class Exponierer extends MathOp
{
	Exponierer()
	{
		
	}
	
	public void execOp(float value1, float value2)
	{
		result =  (float) Math.pow(value1, value2);
	}
}
