package arenaClasses;

import java.util.Collection;

public abstract class Employee implements Collection<String> {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected Department department;
	private int id;
	private float salary;

	// Constructor:
	public Employee(int id, String firstName, String lastName, int age, Department department, float salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setDepartment(department);
		setId(id);
		setSalary(salary);
	}
	// Class Methods:

	// Data members getters and setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
