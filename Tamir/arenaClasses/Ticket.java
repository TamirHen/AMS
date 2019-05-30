package arenaClasses;

public abstract class Ticket {
	private float ticketPrice;
	private int ticketSectionId;
	private boolean isPurchased;

	// Constructor:
	public Ticket(float ticketPrice, int ticketSectionId, boolean isPurchased) {
		this.setTicketPrice(ticketPrice);
		this.setTicketSectionId(ticketSectionId);
		this.setPurchased(false);
	}

	// Data members getters and setters:
	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTicketSectionId() {
		return ticketSectionId;
	}

	public void setTicketSectionId(int ticketSectionId) {
		this.ticketSectionId = ticketSectionId;
	}

	public boolean isPurchased() {
		return isPurchased;
	}

	public void setPurchased(boolean isPurchased) {
		this.isPurchased = isPurchased;
	}

}
