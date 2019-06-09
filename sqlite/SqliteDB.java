package sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.*;

public class SqliteDB {
	Connection c = null;
	Statement stmt = null;
	
	public Stadium stadium;
	public User[] user;
	public User signInUser;
	private int userSize=0;
	
	public SqliteDB() {
		//try to connect to DB:
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:AMS_DB.sqlite");
			System.out.println("Connected Successfully to DB");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void initializeUsers() {
		
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from User");
			
			while(rs.next()) {
				userSize++;
			}
			rs = stmt.executeQuery("select * from User");
			user = new User[userSize];
			userSize=0;
			while(rs.next()) {
				this.user[userSize]=new User(rs.getString("userName"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("password"), rs.getString("email"));
				userSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}	
	public void initializeStadium () {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Stadium");
			
			this.stadium = new Stadium(Integer.parseInt(rs.getString("stadiumId")), rs.getString("stadiumName"), rs.getString("homeTeam"), Integer.parseInt(rs.getString("capacity")), rs.getString("address"),Integer.parseInt(rs.getString("numOfSections")));

			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

	public void closeConnection() {
		try {
			c.close();

		} catch (Exception e) {
			// error
		}
	}

	public boolean isUserExist(String userName, char[] password) {
		String temp = new String(password);
		for(int i=0; i<userSize; i++) {
			if (userName.equals(user[i].getUserName())&&temp.equals(user[i].getPassword())) {
				this.signInUser=user[i];
				return true;
			}
		}
		return false;
	}
}
