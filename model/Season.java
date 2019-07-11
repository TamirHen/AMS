package model;

public class Season {
	private String name;
	private String leagueName;
	
	private Game[] games;
	private int numOfGames;
	private float seasonRevenue;
	
	public Season(String name, String leagueName) {
		this.name=name;
		this.leagueName=leagueName;
		this.numOfGames=0;
		this.seasonRevenue=0;
	}
	//methods:
	public int getNumOfGames() {
		return numOfGames;
	}
	public String getName() {
		return name;
	}
	public String leagueName() {
		return leagueName;
	}
	public void createGame(String name, String date, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
		games[numOfGames]=new Game(name, date, sadiumCapacity, vipTicketPrice, clubLevelTicketPrice, bleachersTicketPrice, seasonTicketPrice, stadium);
		numOfGames++;
	}
	public float getGamesRevenue() {
		for (int i = 0; i < numOfGames; i++) {
			this.seasonRevenue+=games[i].getTotalGameRevenue();
		}
		return this.seasonRevenue;
	}
	public Game getGame(int gameNumber){
		return this.games[gameNumber];		
	}
}
