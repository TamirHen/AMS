package model;

public  class Ticket {
	
	private float vipTicketPrice;
	private float clublevelTicketPrice;
	private float bleachersTicketPrice;
	
	// Constructor:
	public Ticket(float vipTicketPrice, float clublevelTicketPrice, float bleachersTicketPrice) {
		this.vipTicketPrice=vipTicketPrice;
		this.clublevelTicketPrice=clublevelTicketPrice;
		this.bleachersTicketPrice=bleachersTicketPrice;
	}


	public float getVipTicketPrice() {
		return vipTicketPrice;
	}


	public void setVipTicketPrice(float vipTicketPrice) {
		this.vipTicketPrice = vipTicketPrice;
	}


	public float getClublevelTicketPrice() {
		return clublevelTicketPrice;
	}


	public void setClublevelTicketPrice(float clublevelTicketPrice) {
		this.clublevelTicketPrice = clublevelTicketPrice;
	}


	public float getBleachersTicketPrice() {
		return bleachersTicketPrice;
	}


	public void setBleachersTicketPrice(float bleachersTicketPrice) {
		this.bleachersTicketPrice = bleachersTicketPrice;
	}

}
