package arenaClasses;

public class Section {
	private int sectionNumber;
	private static int nextSectionNumber = 1;
	private String sectionName;
	private String sectionRanking;
	private float price;
	private boolean isRoofed;
	private int numOfSeats;
	private int takenSeats;
	private int availableSeats;
	private String sectionType;

	// Constructor:
	public Section(String sectionRanking, float ticketPrice, boolean isRoofed, int numOfSeats, String sectionType) {
		this.setSectionNumber();
		Section.setNextSectionNumber();
		this.setSectionName(sectionNumber);
		this.setSectionRanking(sectionRanking);
		this.setTicketPrice(ticketPrice);
		this.setRoofed(isRoofed);
		this.setNumOfSeats(numOfSeats);
		this.setTakenSeats(0);
		this.setAvailableSeats(numOfSeats);
		this.setSectionType(sectionType);
	}

	// Data members getters and setters:
	public int getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber() {
		this.sectionNumber = nextSectionNumber;
	}

	public static int getNextSectionNumber() {
		return nextSectionNumber;
	}

	public static void setNextSectionNumber() {
		Section.nextSectionNumber++;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(int sectionNumber) {
		this.sectionName = "Section " + String.valueOf(this.sectionNumber);
	}

	public String getSectionRanking() {
		return sectionRanking;
	}

	public void setSectionRanking(String sectionRanking) {
		this.sectionRanking = sectionRanking;
	}

	public float getTicketPrice() {
		return price;
	}

	public void setTicketPrice(float price) {
		this.price = price;
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
