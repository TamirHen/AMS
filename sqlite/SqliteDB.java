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
	public int seasonSize=0;
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
				this.section[sectionSize]=new Section(Integer.parseInt(rs.getString("sectionNumber")), rs.getString("sectionName"), rs.getString("sectionRanking"), Float.parseFloat(rs.getString("ticketPrice")), rs.getBoolean("isRoofed"), Integer.parseInt(rs.getString("numOfSeats")), rs.getString("sectionType"));
				sectionSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public Season[] initializeSeasons() {
		Season[] season=null;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Season");
			while(rs.next()) {
				seasonSize++;
			}
			rs = stmt.executeQuery("select * from Season");
			season = new Season[seasonSize];
			seasonSize=0;
			while(rs.next()) {
				season[seasonSize]=new Season(rs.getString("name"), rs.getString("leagueName"));
				season[seasonSize].games=initializeGames(season[seasonSize]);
				seasonSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return season;
	}
	
	public Game[] initializeGames(Season season) {
		Game[] game=null;
		int index=0;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Game where season='"+season.getName()+"'");
			while(rs.next()) {
				index++;
			}
			season.setNumOfGames(index);
			rs = stmt.executeQuery("select * from Game where season='"+season.getName()+"'");
//			System.out.println("select * from Game where season.name="+season.getName());
			game = new Game[index];
			index=0;
			while(rs.next()) {
				game[index]=new Game(rs.getString("name"), rs.getString("date"),this.stadium.getCapacity(), 100, 50, 20, 300, this.stadium);//need to create class for the ticket prices and changed it here
				game[index].gameSections=initializeGameSections(game[index]);
				index++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return game;
	}
	public GameSection[] initializeGameSections(Game game) {
		GameSection[] gameSection=null;
		int index=0;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from GameSection where game='"+game.getName()+"'");
			while(rs.next()) {
				index++;
			}
			rs = stmt.executeQuery("select * from GameSection where game='"+game.getName()+"'");
			gameSection = new GameSection[index];
			index=0;
			while(rs.next()) {
				gameSection[index]=new GameSection(stadium.getArenaSection(rs.getInt("sectionNumber")));
				index++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return gameSection;
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
	
	public void createNewSeasonDB(String name, String leagueName) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Season values('"+name+"', '"+leagueName+"', "+0+", "+0+")");
			stmt.executeUpdate("insert into Season values('"+name+"', '"+leagueName+"', "+0+", "+0+")");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createGameDB(String name, String date, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Game values('"+name+"', '"+date+"', "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+")");
			stmt.executeUpdate("insert into Game values('"+name+"', '"+date+"', "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+")");

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
	
	public void updateGameSectionSoldTicketsDB(int totalSoldTickets) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update gameSection set soldTickets="+totalSoldTickets);
			stmt.executeUpdate("update gameSection set soldTickets="+totalSoldTickets);
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
