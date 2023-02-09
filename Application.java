/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		
		npc.setActive(true);
		npc.getID();
		npc.setPersonality("Energetic");
		npc.setIntelligenceType("SUPER BIG BRAIN");
		
		System.out.println(npc.reportStructure());
		System.out.println(""+npc.getID()+" Said: "+npc.exclaim());

	}//end main

}//end class