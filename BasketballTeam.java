public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	//Default constructor
	public BasketballTeam()
	{
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrows = 0;
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
		
	}//Default Constructor ends here

	//Preferred Constructor
	public BasketballTeam(String teamName, String teamMascot
							,String headCoach)
	{
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrows = 0;
		this.wins = 0;
		this.losses = 0;
	}//Preferred Constructor ends here
	
	//Field goal percentage method starts here
	public double fieldGoalPercentage()
	{
		double fieldGoalPercentage = fieldGoals/fieldGoalsAttempted;
		return fieldGoalPercentage;
	}//Field goal percentage method ends here
	
	//Free Throw Percentage method starts here
	public double fieldThrowPercentage()
	{
		double fieldThrowPercentage = freeThrows/freeThrowsAttempted;
		return fieldThrowPercentage;
	}//Free throw percentage method ends here
	
	//Set stats method starts here
	public void setStats(int wins, int losses, int fieldGoals,
						int fieldGoalsAttempted, int freeThrows,
						int freeThrowsAttemped)
	{
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttemped;
		
	}
	
	
	
	@Override
	//The override getStats method starts here
	public double[] getStats() {
		// TODO Auto-generated method stub
		
		//These variables are created to hold the method's result
		
		double winPerc;
		double fieldGoalPer;
		double fieldThrowPer;
		
		/*Each of these variables hold the 
		 * methods result
		 */
	
		
		/*Once the variables hold the method's
		 * result, they get stored into an array called 
		 * stats, where it can then return the variables
		 * and their values in an array format.
		 */
		
		double[] stats = new double[3];
		
		
		winPerc = getWinPercentage();
		fieldGoalPer = fieldGoalPercentage();
		fieldThrowPer = fieldThrowPercentage();
		stats[0] = winPerc;
		stats[1] = fieldGoalPer;
		stats[2] = fieldThrowPer;
		
		
		//Old Code
				/*
				for(int i = 0; i < stats.length; i++)
				{
					if(stats[i] == 0)
					{
						stats[i] = getWinPercentage();
						System.out.println(stats[i]);
					}
					
					else if(stats[i] == 1)
					{
						stats[i] = fieldGoalPercentage();
						System.out.println(stats[i]);
					}
					
					else if(stats[i] == 2)
					{
						stats[i] = fieldThrowPercentage();
						System.out.println(stats[i]);
					}
						
				}
				*/
				/*
				StringBuilder sb3 = new StringBuilder();
				sb3.append(""+getWinPercentage());
				sb3.append(""+fieldGoalPercentage());
				sb3.append(""+fieldThrowPercentage());
				
				StringBuilder ahahahh = (StringBuilder) sb3;
			String [] stats1 = {ahahahh};
				*/
		//Old Code ends HERE
			
		/*For loop that loops through the array with the
		 * results
		 */
		
		/*In the System.out line, it
		 * actually prints each variable
		 * in the array that holds the methods 
		 * with the result 
		 */
		for(int i = 0; i < stats.length; i++) 
		{
			 System.out.println(stats[i]); 
			 
		}//For loop ends here
		return null;
		
	}//Get Stats ends here

}//Classes ends here
