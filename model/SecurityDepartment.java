package model;

import java.util.ArrayList;

public class SecurityDepartment extends FacilitiesDepartment {
	
	public SecurityDepartment(String i_DepartmentName, Stadium i_Stadium) {
		super(i_DepartmentName, i_Stadium);
		this.setNumOfEmployees(0);
		this.sectionCoverage = new int[i_Stadium.getNumOfSections()];
		this.availableEmployees = this.numOfEmployees;
		this.occupiedEmployees = 0;		
	}
	
	

}
