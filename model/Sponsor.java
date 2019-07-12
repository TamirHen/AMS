package model;
import java.util.Date;

public class Sponsor {
	private String name;
	private Date contractStartDate;
	private Date contractEndDate;
	private int contractLength;
	private float totalContractValue;

	// Constructor:
	public Sponsor(String name, Date contractStartDate, Date contractEndDate, float totalContractValue) {
		this.name=name;
		this.contractStartDate=contractStartDate;
		this.contractEndDate=contractEndDate;
		this.totalContractValue=totalContractValue;
		//contractLength= //need to work on it
	}

}
