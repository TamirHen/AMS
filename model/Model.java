package model;
import sqlite.*;

public class Model {
	//---set DB---//
	public SqliteDB db;
	//---set stadium---//
	public Stadium stadium;
	//-----------------//
	//---set users---//
	public User signInUser;
	//---------------//
	
	public Model() {
		//set DB:
		db = new SqliteDB();
		// set stadium:
		db.initializeStadium();
		stadium = db.stadium;
		//set users:
		db.initializeUsers();
		
	}
}
