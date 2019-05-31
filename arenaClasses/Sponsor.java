package arenaClasses;

public class Sponsor extends Department {
	private String sponsorName;

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

}
