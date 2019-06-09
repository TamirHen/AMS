package model;

public class Sponsor extends Department {
	private String sponsorName;
	private float annualRevenue;

	// Constructor:
	public Sponsor(String departmentName, String sponsorName) {
		super(departmentName);
		this.setSponsorName(sponsorName);
	}

	// Data members getters and setters:
	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public float getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(float annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

}
