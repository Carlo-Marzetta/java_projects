public class A 
{
	private B m_B;
	
	A()
	{
		m_B = new B(this);
	}
	
	A(B _B)
	{
		m_B = _B;
	}
	
	public B getB()
	{
		return m_B;
	}
}