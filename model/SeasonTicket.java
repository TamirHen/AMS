package model;

public class SeasonTicket extends Ticket {
	private int seasonTicketId;
	private String seasonValidation;

	// Constructor:
	public SeasonTicket(float ticketPrice, int ticketSectionId, boolean isPurchased, int seasonTicketId,
			String seasonValidation) {
		super(ticketPrice, ticketSectionId, isPurchased);
		this.setSubscriptionTicketId(seasonTicketId);
		this.setSeasonValidation(seasonValidation);
	}

	// Data members getters and setters:
	public int getSubscriptionTicketId() {
		return seasonTicketId;
	}

	public void setSubscriptionTicketId(int seasonTicketId) {
		this.seasonTicketId = seasonTicketId;
	}

	public String getSeasonValidation() {
		return seasonValidation;
	}

	public void setSeasonValidation(String seasonValidation) {
		this.seasonValidation = seasonValidation;
	}
}
