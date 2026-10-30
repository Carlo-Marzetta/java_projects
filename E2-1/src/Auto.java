
public class Auto 
{
	private String nrSchild;
	private int counter;
	private final int MAXSIZE = 4;
	private Rad[] raeder;
	private Motor motor;
	
	
	public Auto()
	{
		raeder = new Rad[MAXSIZE];
	}
	
	public String getNrSchild()
	{
		return nrSchild;
	}
	
	public void setNrSchild(String nrSchild)
	{
		this.nrSchild = nrSchild;
	}
	 
	public Rad getRad(int index)
	{
		return raeder[index];
	}
	
	public void addRad(Rad rad, int position)
	{
		if(position >= 0 && position < 4)
		{
			raeder[position] = rad;
		}
	}
	
	public Motor getMotor()
	{
		return motor;
	}
	
	public void setMotor(Motor motor)
	{
		this.motor = motor;
	}
	
	public void print()
	{
		System.out.println("Auto " + nrSchild);
		motor.print();
		raeder[1].print();
	}
	
	
	
	
	
	
}
