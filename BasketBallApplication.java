public class BasketBallApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasketballTeam BBTeam1 = new BasketballTeam("Lakers","Lakers Doggo", "Darvin Ham" );
		
		BBTeam1.setStats(300,50,2000,500,4833,400);
		
		
		System.out.println(BBTeam1.getStats());
		
	}

}
