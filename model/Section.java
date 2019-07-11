package model;

public class Section {
	private int sectionNumber;
	private String sectionName;
	private String sectionRanking;
	private float ticketPrice;
	private boolean isRoofed;
	private int numOfSeats;
	private int takenSeats;
	private int availableSeats;
	private String sectionType;

	// Constructor:
	public Section(int sectionNumber, String sectionName, String sectionRanking, float ticketPrice, boolean isRoofed, int numOfSeats, int takenSeats, int availableSeats, String sectionType) {
		this.sectionNumber=sectionNumber;
		this.sectionName=sectionName;
		this.sectionRanking=sectionRanking;
		this.ticketPrice=ticketPrice;
		this.isRoofed=isRoofed;
		this.numOfSeats=numOfSeats;
		this.takenSeats=takenSeats;
		this.availableSeats=availableSeats;
		this.sectionType=sectionType;
	}

	// Data members getters and setters:
	public int getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getSectionRanking() {
		return sectionRanking;
	}

	public void setSectionRanking(String sectionRanking) {
		this.sectionRanking = sectionRanking;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public boolean isRoofed() {
		return isRoofed;
	}

	public void setRoofed(boolean isRoofed) {
		this.isRoofed = isRoofed;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int newNumOfSeats, Stadium stadium) {
		
		stadium.setCapacity(newNumOfSeats-this.numOfSeats); //send only the difference to the stadium
		this.numOfSeats = newNumOfSeats;
		//needs to update the DB as well
		
	}

	public int getTakenSeats() {
		return takenSeats;
	}

	public void setTakenSeats(int takenSeats) {
		this.takenSeats = takenSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getSectionType() {
		return sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}


}
