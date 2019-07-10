package model;

public class Game {
	private String name;
	private String date;
	public GameSection[] gameSections;
	private int stadiumCapacity;
	private int unSoldTickets;
	private int vipTicketsSold;
	private int clubLevelTicketsSold;
	private int bleachersTicketsSold;
	private int seasonTicketsSold;
	
	private float vipTicketPrice;
	private float clubLevelTicketPrice;
	private float bleachersTicketPrice;
	private float seasonTicketPrice;
	
	private float vipRevenue;
	private float clubLevelRevenue;
	private float bleachersRevenue;
	private float seasonTicketsRevenue;

	//Constructor
		public Game (String name, String date, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
			this.name=name;
			this.date=date;
			this.stadiumCapacity=stadiumCapacity;
			unSoldTickets=stadiumCapacity;
			vipTicketsSold=0;
			clubLevelTicketsSold=0;
			bleachersTicketsSold=0;
			seasonTicketsSold=0;
			this.vipTicketPrice=vipTicketPrice;
			this.clubLevelTicketPrice=clubLevelTicketPrice;
			this.bleachersTicketPrice=bleachersTicketPrice;
			this.seasonTicketPrice=seasonTicketPrice;
			for (int i = 0; i < stadium.getNumOfSections(); i++) {
				gameSections[i] = new GameSection(stadium.getArenaSection(i+1));
			}
			
		}
		
		//Methods
		public void setVipTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.vipTicketsSold+=numOfTicketsSold;
			this.vipRevenue+=(numOfTicketsSold*vipTicketPrice);
			this.unSoldTickets-=numOfTicketsSold;
			this.gameSections[sectionNumber].setSoldTickets(numOfTicketsSold);
		}
		public void setClubLevelTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.clubLevelTicketsSold+=numOfTicketsSold;
			this.clubLevelRevenue+=(numOfTicketsSold*clubLevelTicketPrice);
			this.unSoldTickets-=numOfTicketsSold;
			this.gameSections[sectionNumber].setSoldTickets(numOfTicketsSold);

		}
		public void setBleachersTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.bleachersTicketsSold+=numOfTicketsSold;
			this.bleachersRevenue+=(numOfTicketsSold*bleachersTicketPrice);
			this.unSoldTickets-=numOfTicketsSold;
			this.gameSections[sectionNumber].setSoldTickets(numOfTicketsSold);

		}
		public void setSeasonTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.seasonTicketsSold+=numOfTicketsSold;
			this.seasonTicketsRevenue+=(numOfTicketsSold*seasonTicketPrice);
			this.unSoldTickets-=numOfTicketsSold;
			this.gameSections[sectionNumber].setSoldTickets(numOfTicketsSold);

		}
		
		public int getVipTicketsSold() {
			return this.vipTicketsSold;
		}
		public int getClubLevelTicketsSold() {
			return this.clubLevelTicketsSold;
		}
		public int getBleachersTicketsSold() {
			return this.bleachersTicketsSold;
		}
		public int getSeasonTicketsSold() {
			return this.seasonTicketsSold;
		}

		private float getVipRevenue() {
			return vipRevenue;
		}

		private float getClubLevelRevenue() {
			return clubLevelRevenue;
		}

		private float getBleachersRevenue() {
			return bleachersRevenue;
		}

		private float getSeasonTicketsRevenue() {
			return seasonTicketsRevenue;
		}
		
		
		
}