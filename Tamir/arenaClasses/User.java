package arenaClasses;

//Not ready, we need to decide if we want to use it (needs to set private and getters/setters)

public class User {
	String userName;
	String firstName;
	String lastName;
	int userId;
	static int nextUserId;
	private String password;
	private String email;

	// Constructor:
	public User(String userName, String firstName, String lastName, String password, String email) {
		User.nextUserId = 1;
		this.userId = User.nextUserId;
		User.nextUserId++;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
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

}
