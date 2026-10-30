
public class Spielplan 
{
	public static void main(String[] args)
	{
		Team teamA, teamB;
		
		teamA = new Team("Broncos");
		teamB = new Team("Alligators");
		
		Match m5;
		
		m5 = new Match(5);
		
		m5.setTeamA(teamA);
		m5.setTeamB(teamB);
		
		m5.print();
	}
}
