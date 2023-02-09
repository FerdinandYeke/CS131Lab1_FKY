import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	Random generator = new Random();
	
	
	//Default Constructor
	public NonPlayerCharacter()
	{
		super();
		active = false;
		intelligenceType = "AVERAGE";
	}//Default Constructor ends here
	
	
	//Preferred Constructor
	public NonPlayerCharacter(String id, String personality,
							boolean active, String intelligenceType)
	{
		super();
		this.uniqueID = id;
		this.personality = personality;
		this.active = active;
		this.intelligenceType = intelligenceType;
	}
	
	//Setters
	
	//Set Id setter
	public void setID(String id)
	{
		uniqueID = id;
	}//Set Id setter ends here
	
	//Set Personality Setter
	public void setPersonality(String personality)
	{
		this.personality = personality;
	}//Set Personality Setter ends here
	
	//Set Active Setter
	public void setActive(boolean active)
	{
		this.active = active;
	}//Set Active Setter ends here
	
	//Set Intelligence Type
	public void setIntelligenceType(String intelligenceType)
	{
		this.intelligenceType = intelligenceType;
	}//Set Intelligence Type ends here
	//Setters End here
	
	//Getters Start here
	
	//Get ID getter
	public String getID()
	{
		return uniqueID;
	}//Get Id ends here
	
	//Get Personality getter
	public String getPersonality()
	{
		return personality;
	}//Get Personality ends here
	
	//Get active getter
	public boolean getActive()
	{
		return active;
	}//Get active getter ends here
	
	//Get IntelligenceType Getter
	public String getIntelligenceType()
	{
		return intelligenceType;
	}//Get IntelligenceType getter ends here
	//Getters end here
	
	//ReportStucture method Gets called and runs
	public String reportStructure()
	{
		super.reportStructure(); //Or reportStructure();
		StringBuilder sb2 = new StringBuilder("==================================\n");
		sb2.append("UniqueID: "+getUniqueID()+"\n");
		sb2.append("Personality: "+getPersonality()+"\n");
		sb2.append("==================================\n");
		sb2.append("Active: "+getActive()+"\n");
		sb2.append("Intelligence: "+getIntelligenceType()+"\n");
		sb2.append("==================================");

		return sb2.toString();
		
	}//ReportStructure ends here
	
	//Introduce method
	//String NAME = uniqueID;
	public String introduce()
	{
		StringBuilder sb3 = new StringBuilder();
		sb3.append("Hello, My name is: "+getUniqueID());
		return sb3.toString();
		
	}//Introduce method ends here
	
	//exclaim method starts here
	public String exclaim()
	{
		//This prints out various lines of what the NPC could say
		String ex1 = "Dag Gummit";
		String ex2 = "Doggone it";
		String ex3 = "Holy Cow";
		String ex4 = "Jeez";
		String ex5 = "Well cheese and crackers";
		//The various lines of the NPC speech ends here
		
		
		/*The exclaim[] array keeps all of the
		 * variables of the NPC speech in its
		 * array
		 */
		
		String[] exclaim = {ex1, ex2, ex3, ex4, ex5};
		//The exclaim[] array ends here
		
		
		//gen_Result starts here
		/*The gen_Result is a variable that
		 * stores random integer numbers from
		 * 0 to 4; this is to match the exclaim[]
		 * array's length, which counts from 0 to
		 * 4...where they are both 5.
		 */
		
			int gen_Result = generator.nextInt(5);
			//gen_Result ends here.
	
			//Old Code of using the gen_Result variable
			
		
			/*if(gen_Result == 1)
			{
				System.out.println(exclaim[0]);
			}
			
			else if(gen_Result == 2)
			{
				System.out.println(exclaim[1]);
			}
			
			else if(gen_Result == 3)
			{
				System.out.println(exclaim[2]);
			}
			
			else if(gen_Result == 4)
			{
				System.out.println(exclaim[3]);
			}
			
			else if(gen_Result == 5)
			{
				System.out.println(exclaim[4]);
			}	
		*/
		//Old Code ends here
			
		/*The random integer value of 
		 * what the gen_Result has will
		 * be the index of the array variables
		 *  in the exclaim[] array; then it
		 * returns the array variable context.
		 */
		/*In other words, the gen_Result
		 * is just a random index value from 0-4
		 *  for the exclaim[] array
		 */
		return exclaim[gen_Result];
	}
	//exclaim() ends here
	
}//class ends here
