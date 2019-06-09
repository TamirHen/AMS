package model;

public class IndividualTicket extends Ticket {
	private int individualTicketId;
	private String gameValidation;

	// Constructor:
	public IndividualTicket(float ticketPrice, int ticketSectionId, boolean isPurchased, int individualTicketId,
			String gameValidation) {
		super(ticketPrice, ticketSectionId, isPurchased);
		this.setIndividualTicketId(individualTicketId);
		this.setGameValidation(gameValidation);
	}

	// Data members getters and setters:
	public int getIndividualTicketId() {
		return individualTicketId;
	}

	public void setIndividualTicketId(int individualTicketId) {
		this.individualTicketId = individualTicketId;
	}

	public String getGameValidation() {
		return gameValidation;
	}

	public void setGameValidation(String gameValidation) {
		this.gameValidation = gameValidation;
	}
}
