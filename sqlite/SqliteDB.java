package sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.*;

public class SqliteDB {
	private static SqliteDB instance=null;
	Connection c = null;
	Statement stmt = null;
	
	public Stadium stadium;
	public int userSize=0;
	public Section[] section;
	public int sectionSize=0;
	
	//Constructor:
	private SqliteDB() {
		//try to connect to DB:
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:AMS_DB.sqlite");
			System.out.println("Connected Successfully to DB");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// get instance to initialize DB:
	public static SqliteDB getInstance() {
		if (instance==null) {
			instance = new SqliteDB();
		}
		return instance;
	}
	
	// Methods:
	
	// initialize methods:
	public User[] initializeUsers() {
		
		User[] user=null;

		try {

			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from User");
			
			user = new User[100];
			userSize=0;
			while(rs.next()) {
				user[userSize]=new User(rs.getString("userName"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("password"), rs.getString("email"));
				userSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return user;

	}
	
	public void initializeStadium () {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Stadium");
			int stadiNumOfSeats=0;
			initializeSections();
			for (int i = 0; i < this.sectionSize; i++) {
				stadiNumOfSeats+=section[i].getNumOfSeats();
			}
			this.stadium = Stadium.getInstance(Integer.parseInt(rs.getString("stadiumId")), rs.getString("stadiumName"), rs.getString("homeTeam"), stadiNumOfSeats, rs.getString("address"),Integer.parseInt(rs.getString("numOfSections")), section);

			
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
	
	//create methods:
	public void createNewUserDB(String userName, String firstName, String lastName, char[] pf_password, String email) {
		try {
			this.stmt = c.createStatement();
			String password = new String(pf_password);
			System.out.println("insert into User values('"+userName+"', '"+firstName+"', '"+lastName+"', '"+password+"', '"+email+"')");
			stmt.executeUpdate("insert into User values('"+userName+"', '"+firstName+"', '"+lastName+"', '"+password+"', '"+email+"')");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	//update methods:
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
	
	
	// close connection:
	public void closeConnection() {
		try {
			c.close();

		} catch (Exception e) {
			System.out.println("Failed to close the connection to DB");
		}
	}
	
}
