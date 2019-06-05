import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import arenaClasses.*;

public class SqliteDB {
	Connection c = null;
	Statement stmt = null;
	
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
	
	public void getUserName() {
		
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from User");
			
			while(rs.next()) {
				String userName = rs.getString("userName");
				String password = rs.getString("password");
				
				System.out.println(userName + "  " + password);

			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}	
	public ResultSet getStadiumDetailsDB() {
		ResultSet rs = null;
		try {
			this.stmt = c.createStatement();
			rs = stmt.executeQuery("select top 1 * from Stadium");
//			stadium = new Stadium(Integer.parseInt(rs.getString("stadiumId")), rs.getString("stadiumName"), rs.getString("homeTeam"), Integer.parseInt(rs.getString("capacity")), rs.getString("address"));
//			stadium.setStadiumId(Integer.parseInt(rs.getString("stadiumId")));
//			stadium.setStadiumName(rs.getString("stadiumName"));
//			stadium.setHomeTeam(rs.getString("homeTeam"));
//			stadium.setAddress(rs.getString("address"));
//			stadium.setCapacity(Integer.parseInt(rs.getString("capacity")));
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return rs;
	}
	//close close User:
	public void closeConnection() {
		try {
			c.close();

		} catch (Exception e) {
			// error
		}
	}
}
