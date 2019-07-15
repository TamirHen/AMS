package model;

public class SingleTicket extends Ticket {
	private int singleTicketId;
	private String gameValidation;

	// Constructor:
	public SingleTicket(float ticketPrice, int ticketSectionId, boolean isPurchased, int singleTicketId,
			String gameValidation) {
		super(ticketPrice, ticketSectionId, isPurchased);
		this.setIndividualTicketId(singleTicketId);
		this.setGameValidation(gameValidation);
	}

	// Data members getters and setters:
	public int getIndividualTicketId() {
		return singleTicketId;
	}

	public void setIndividualTicketId(int individualTicketId) {
		this.singleTicketId = individualTicketId;
	}

	public String getGameValidation() {
		return gameValidation;
	}

	public void setGameValidation(String gameValidation) {
		this.gameValidation = gameValidation;
	}
}
