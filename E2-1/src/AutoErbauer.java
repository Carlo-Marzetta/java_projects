
public class AutoErbauer 
{
	public static void main(String[] args)
	{
		Auto auto;
		auto = new Auto();
		
		Rad r;
		r = new Rad();
		
		
		r.setGroesse(15);
		r.setTyp("tubless");
		
		
		for (int i = 0; i < 3; i++)
		{
			auto.addRad(r, i);
		}
		
		
		Motor m;
		m = new Motor();
		
		m.setLeistung(400);
		m.setHubraum(2f);
		
		auto.setMotor(m);
		auto.setNrSchild("ZH 1 000 000");
		
		auto.print();
		
		
		auto = null;
		
		m.print();
		r.print();
		auto.print();
	}
}
