package model;

public abstract class Department {
	protected String departmentName;
	protected int numOfEmployees;

	// Constructor:
	public Department(String i_DepartmentName) 
	{
		this.setDepartmentName(i_DepartmentName);
	}

	// Data members getters and setters:
	public String getDepartmentName()
	{
		return departmentName;
	}

	public void setDepartmentName(String i_DepartmentName)
	{
		this.departmentName = i_DepartmentName;
	}
	
	public int getNumOfEmployees()
	{
		return numOfEmployees;
	}
	
	public void setNumOfEmployees(int i_NumOfEmployees)
	{
		this.numOfEmployees = i_NumOfEmployees;
	}
}
