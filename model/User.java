package model;

public class User {
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

	// Constructor:
	public User(String username, String firstName, String lastName, String password, String email) {
		this.setUserName(username);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		setPassword(password);
		setEmail(email);
	}

	// Class Methods:
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
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

}
