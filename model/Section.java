package model;

public class Section {
	private int sectionNumber;
	private String sectionName;
	private String sectionRanking;
	private float pricePrice;
	private boolean isRoofed;
	private int numOfSeats;
	private int takenSeats;
	private int availableSeats;
	private String sectionType;

	// Constructor:
	public Section(int sectionNumber, String sectionName, String sectionRanking, float ticketPrice, boolean isRoofed, int numOfSeats, int takenSeats, int availableSeats, String sectionType) {
		this.setSectionNumber(sectionNumber);
		this.setSectionName(sectionName);
		this.setSectionRanking(sectionRanking);
		this.setTicketPrice(ticketPrice);
		this.setRoofed(isRoofed);
		this.setNumOfSeats(numOfSeats);
		this.setTakenSeats(takenSeats);
		this.setAvailableSeats(availableSeats);
		this.setSectionType(sectionType);
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
		return pricePrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.pricePrice = ticketPrice;
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

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
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

	// Methods:

}
