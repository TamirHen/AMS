package model;

public abstract class Ticket {
	private int ticketId;
	private float ticketPrice;
	private int ticketSection;
	private boolean isPurchased;

	// Constructor:
	public Ticket(float ticketPrice, int ticketSection, boolean isPurchased) {
		this.setTicketPrice(ticketPrice);
		this.setTicketSection(ticketSection);
		this.setPurchased(false);
	}

	// Data members getters and setters:
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTicketSection() {
		return ticketSection;
	}

	public void setTicketSection(int ticketSectionId) {
		this.ticketSection = ticketSectionId;
	}

	public boolean isPurchased() {
		return isPurchased;
	}

	public void setPurchased(boolean isPurchased) {
		this.isPurchased = isPurchased;
	}


}
