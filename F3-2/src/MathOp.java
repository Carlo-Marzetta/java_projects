
public abstract class MathOp 
{
	float result;
	
	MathOp()
	{
		
	}
	
	public abstract void execOp(float val1, float val2);
	
	public float getResultat()
	{
		return result;
	}
	
	public void printResult()
	{
		System.out.println(result);
	}
}
