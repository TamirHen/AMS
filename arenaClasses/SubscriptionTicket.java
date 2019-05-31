package arenaClasses;

public class SubscriptionTicket extends Ticket {
	private int subscriptionTicketId;
	private String seasonValidation;

	// Constructor:
	public SubscriptionTicket(float ticketPrice, int ticketSectionId, boolean isPurchased, int subscriptionTicketId,
			String seasonValidation) {
		super(ticketPrice, ticketSectionId, isPurchased);
		this.setSubscriptionTicketId(subscriptionTicketId);
		this.setSeasonValidation(seasonValidation);
	}

	// Data members getters and setters:
	public int getSubscriptionTicketId() {
		return subscriptionTicketId;
	}

	public void setSubscriptionTicketId(int subscriptionTicketId) {
		this.subscriptionTicketId = subscriptionTicketId;
	}

	public String getSeasonValidation() {
		return seasonValidation;
	}

	public void setSeasonValidation(String seasonValidation) {
		this.seasonValidation = seasonValidation;
	}
}
