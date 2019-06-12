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
	private int userSize=0;
	public User signInUser;
	public Section[] section;
	public int sectionSize=0;

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
			initializeSections();
			this.stadium = new Stadium(Integer.parseInt(rs.getString("stadiumId")), rs.getString("stadiumName"), rs.getString("homeTeam"), Integer.parseInt(rs.getString("capacity")), rs.getString("address"),Integer.parseInt(rs.getString("numOfSections")), section);

			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void initializeSections() {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Section");
			
			while(rs.next()) {
				sectionSize++;
			}
			rs = stmt.executeQuery("select * from Section");
			section = new Section[sectionSize];
			sectionSize=0;
			while(rs.next()) {
				this.section[sectionSize]=new Section(Integer.parseInt(rs.getString("sectionNumber")), rs.getString("sectionName"), rs.getString("sectionRanking"), Float.parseFloat(rs.getString("ticketPrice")), Boolean.parseBoolean(rs.getString("isRoofed")), Integer.parseInt(rs.getString("numOfSeats")), Integer.parseInt(rs.getString("takenSeats")), Integer.parseInt(rs.getString("availableSeats")), rs.getString("sectionType"));
				sectionSize++;
			}
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
	
	public void updateProperties(int stadiumIdToUpdate, String stadiumName, String homeTeam, int capacity, String address, int numOfSections) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update Stadium set stadiumName='"+stadiumName+"', homeTeam='"+homeTeam+"', capacity="+capacity+", address='"+address+"', numOfSections="+numOfSections+" where stadiumId="+stadiumIdToUpdate);
			stmt.executeUpdate("update Stadium set stadiumName='"+stadiumName+"', homeTeam='"+homeTeam+"', capacity="+capacity+", address='"+address+"', numOfSections="+numOfSections+" where stadiumId="+stadiumIdToUpdate);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void updateSections(int sectionNumToUpdate, String newSectionType, Float newTicketPrice, int newNumOfSeats, String newIsRoofed, String newSectionRanking) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update Section set sectionType='"+newSectionType+"', ticketPrice="+newTicketPrice+", numOfSeats="+newNumOfSeats+", isRoofed='"+newIsRoofed+"', sectionRanking='"+newSectionRanking+"' where sectionNumber="+sectionNumToUpdate);
			stmt.executeUpdate("update Section set sectionType='"+newSectionType+"', ticketPrice="+newTicketPrice+", numOfSeats="+newNumOfSeats+", isRoofed='"+newIsRoofed+"', sectionRanking='"+newSectionRanking+"' where sectionNumber="+sectionNumToUpdate);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

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
