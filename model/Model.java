package model;
import sqlite.*;

public class Model {
	//---set stadium---//
	public Stadium stadium;
	//-----------------//
	public SqliteDB db;

	//---set users---//
	public User signInUser;
	//---------------//
	
	public Model() {
		//set db:
		db = new SqliteDB();
		// set stadium:
//		setStadium(new Stadium(1, "Bloomfield", "Maccabi Tel Aviv", 29522, "She'erit Israel, Tel Aviv", 15));
		db.initializeStadium();
		stadium = db.stadium;
		//set users:
		db.initializeUsers();
		
	}
}
