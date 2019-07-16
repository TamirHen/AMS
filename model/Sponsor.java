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
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public int getContractLength() {
		return contractLength;
	}

	public void setContractLength(int contractLength) {
		this.contractLength = contractLength;
	}

	public float getTotalContractValue() {
		return totalContractValue;
	}

	public void setTotalContractValue(float totalContractValue) {
		this.totalContractValue = totalContractValue;
	}

}
