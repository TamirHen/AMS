package model;


public abstract class FacilitiesDepartment extends Department{

	protected int[] sectionCoverage;
	protected int occupiedEmployees;
	protected int availableEmployees;

	public FacilitiesDepartment(String i_DepartmentName, Stadium i_Stadium) {
		super(i_DepartmentName);
	}
	
	protected void addEmployees(int i_NumOfEmployees)
	{
		this.numOfEmployees+=i_NumOfEmployees;
	}
	
	protected void removeEmployees(int i_NumOfEmployees)
	{
		this.numOfEmployees-=i_NumOfEmployees;
	}
	
	protected void setAvailableEmployees()
	{
		this.availableEmployees = this.numOfEmployees-this.occupiedEmployees;
	}
	
	protected void assignEmployeesToSection(int i_SectionIndex, int i_NumOfEmployees)
	{
		try
		{
			if(availableEmployees>=i_NumOfEmployees)
			{
				sectionCoverage[i_SectionIndex] = i_NumOfEmployees;
				occupiedEmployees+=i_NumOfEmployees;
				setAvailableEmployees();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	protected void removeEmployeesToSection(int i_SectionIndex, int i_NumOfEmployees)
	{
		try
		{
			if(i_NumOfEmployees>0)
			{
				sectionCoverage[i_SectionIndex] -= i_NumOfEmployees;
				occupiedEmployees-=i_NumOfEmployees;
				setAvailableEmployees();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
