package model;

import java.util.ArrayList;

public class Game {
	private String name;
	private String date;
	public ArrayList<GameSection> gameSections;
	private int stadiumCapacity;
	private int unSoldTickets;
	private int soldTickets;               // for the attendance in sale panel
	private int vipTicketsSold;
	private int clubLevelTicketsSold;
	private int bleachersTicketsSold;
	private int totalSingleTickes;        // club+bleach+vip
	private int seasonTicketsSold;
	
	private float vipTicketPrice;
	private float clubLevelTicketPrice;
	private float bleachersTicketPrice;
	private float seasonTicketPrice;
	
	private float vipRevenue;
	private float clubLevelRevenue;
	private float bleachersRevenue;
	private float singleTicketsRevenue; // club+bleach+vip revenue
	private float seasonTicketsRevenue;
	private float totalGameRevenue;
	//Constructor
		public Game (String name, String date, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
			this.name=name;
			this.date=date;
			this.unSoldTickets=stadiumCapacity;
			this.soldTickets=0;
			this.vipTicketsSold=0;
			this.clubLevelTicketsSold=0;
			this.bleachersTicketsSold=0;
			this.totalSingleTickes=0;
			this.seasonTicketsSold=0;
			this.totalGameRevenue=0;
			this.vipTicketPrice=vipTicketPrice;
			this.clubLevelTicketPrice=clubLevelTicketPrice;
			this.bleachersTicketPrice=bleachersTicketPrice;
			this.seasonTicketPrice=seasonTicketPrice;
			this.gameSections=new ArrayList<GameSection>();
			for (int i = 0; i < stadium.getNumOfSections(); i++) {
				gameSections.add(new GameSection(stadium.getArenaSection(i)));
			}
			
		}
		
		//Methods
		public void vipTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.vipTicketsSold+=numOfTicketsSold;
			this.vipRevenue+=(numOfTicketsSold*vipTicketPrice);
			this.totalGameRevenue+=this.vipRevenue;
			this.unSoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickes+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.vipRevenue;
			this.gameSections.get(sectionNumber).setSoldTickets(numOfTicketsSold);
		}
		public void clubLevelTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.clubLevelTicketsSold+=numOfTicketsSold;
			this.clubLevelRevenue+=(numOfTicketsSold*clubLevelTicketPrice);
			this.totalGameRevenue+=this.clubLevelRevenue;
			this.unSoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickes+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.clubLevelRevenue;
			this.gameSections.get(sectionNumber).setSoldTickets(numOfTicketsSold);

		}
		public void bleachersTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.bleachersTicketsSold+=numOfTicketsSold;
			this.bleachersRevenue+=(numOfTicketsSold*bleachersTicketPrice);
			this.totalGameRevenue+=this.bleachersRevenue;
			this.unSoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickes+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.bleachersRevenue;
			this.gameSections.get(sectionNumber).setSoldTickets(numOfTicketsSold);

		}
		public void seasonTicketsSold(int numOfTicketsSold, int sectionNumber) {
			this.seasonTicketsSold+=numOfTicketsSold;
			this.seasonTicketsRevenue+=(numOfTicketsSold*seasonTicketPrice);
			this.totalGameRevenue+=this.seasonTicketsRevenue;
			this.unSoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.gameSections.get(sectionNumber).setSoldTickets(numOfTicketsSold);

		}
		public String getName() {
			return this.name;
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

		public float getVipRevenue() {
			return vipRevenue;
		}

		public float getClubLevelRevenue() {
			return clubLevelRevenue;
		}

		public float getBleachersRevenue() {
			return bleachersRevenue;
		}

		public float getSeasonTicketsRevenue() {
			return seasonTicketsRevenue;
		}

		public float getTotalGameRevenue() {
			return totalGameRevenue;
		}

		public int getStadiumCapacity() {
			return stadiumCapacity;
		}

		public int getUnSoldTickets() {
			return unSoldTickets;
		}

		public int getSoldTickets() {
			return soldTickets;
		}

		public int getTotalSingleTickes() {
			return totalSingleTickes;
		}

		public float getSingleTicketsRevenue() {
			return singleTicketsRevenue;
		}

		public String getDate() {
			return date;
		}

		
}