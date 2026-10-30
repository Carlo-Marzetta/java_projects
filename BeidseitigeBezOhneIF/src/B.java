public class B
{
	
	private A m_A;
	
	B()
	{
		m_A = new A(this);
	}
	
	B(A _A)
	{
		m_A = _A;
	}
	
	public A getA()
	{
		return m_A;
	}
}