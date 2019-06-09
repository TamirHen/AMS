package model;

public abstract class Department {
	private String departmentName;

	// Constructor:
	public Department(String departmentName) {
		this.setDepartmentName(departmentName);
	}

	// Data members getters and setters:
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
