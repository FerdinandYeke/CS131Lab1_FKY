
abstract class SportsTeam {
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	//Default Constructor
	public SportsTeam()
{
	this.teamName = "";
	this.teamMascot = "";
	this.headCoach = "";
	this.wins = 0;
	this.losses = 0;
}//Default Constructor ends here
	
	
	//Preferred Constructor
	public SportsTeam(String teamName, String teamMascot,
				String headCoach, int wins, int losses)
	{
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 0;
		this.losses = 0;
		
	}//Preferred Constructor ends here
	
	//getWinPercentage() method starts here
	public double getWinPercentage()
	{
		double WinPercentage = wins / wins + losses;
		return WinPercentage;
	}//getWinPercentage() method ends here
	
	//getStats() method starts here
	public abstract double[] getStats();
	//getStats() method ends here
	
}
