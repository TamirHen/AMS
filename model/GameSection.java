package model;

public class GameSection {

	private int sectionNumber;
	private String sectionType;
	private int capacity;
	private int soldTickets;
	private int unsoldTickets;
	private float ticketPrice;
	
	public GameSection(Section section) {
		this.sectionNumber=section.getSectionNumber();
		this.sectionType=section.getSectionType();
		this.capacity=section.getNumOfSeats();
		this.ticketPrice=section.getTicketPrice();
		this.soldTickets=0;
		this.unsoldTickets=capacity;
	}

	public int getSoldTickets() {
		return soldTickets;
	}

	public void setSoldTickets(int soldTickets) {
		this.soldTickets+=soldTickets;
		this.unsoldTickets-=soldTickets;

	}

	public int getUnsoldTickets() {
		return unsoldTickets;
	}

}
