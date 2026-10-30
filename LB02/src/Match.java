
public class Match 
{
	private int spielNr;
	private Team teamA;
	private Team teamB;
	
	
	Match(int spielNr)
	{
		this.spielNr = spielNr;
	}
	
	public Team getTeamA()
	{
		return teamA;
	}
	
	public Team getTeamB()
	{
		return teamB;
	}
	
	public void setTeamA(Team teamA)
	{
		this.teamA = teamA;
	}
	
	public void setTeamB(Team teamB)
	{
		this.teamB = teamB;
	}
	
	public void print()
	{
		System.out.println("Spiel Nummer " + spielNr + ": " + teamA.getName() + " - "+ teamB.getName());
	}
	
}
