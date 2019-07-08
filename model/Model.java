package model;
import sqlite.*;

public class Model {
	//---set DB---//
	public SqliteDB db;
	//---set stadium---//
	public Stadium stadium;
	//-----------------//
	//---set users---//
	public User user[];
	public User signInUser;
	private int userSize;
	//---------------//
	 
	
	public Model() {
		//set DB:
		db = SqliteDB.getInstance();
		// set stadium:
		db.initializeStadium();
		stadium = db.stadium;
		//set users:
		user=db.initializeUsers();
		userSize=db.userSize;
		
	}
	
	//---methods---//
	public boolean isUserNameExist(String userName) {
		for(int i=0; i<userSize; i++) {
			if (userName.equals(user[i].getUserName())) {
				return true;
			}
		}
		return false;
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
	
	public void addUser(String userName, String firstName, String lastName, char[] pf_password, String email) {
		String password = new String(pf_password);
		user[userSize] = new User(userName, firstName, lastName, password, email);
		userSize++;
		db.createNewUserDB(userName, firstName, lastName, pf_password, email);
		
	}
	
}
