package model;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

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
	//---set seasons---//
	public ArrayList<Season> season = new ArrayList<Season>();
//	public Season season[];
	public int seasonSize;
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
		//set seasons:
		this.season=db.initializeSeasons();
		seasonSize=db.seasonSize;
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
	public void createNewSeason(String name, String leagueName) {
		this.season.add(new Season(name, leagueName));
		this.seasonSize++;
		db.createNewSeasonDB(name, leagueName);
	}
	public void createNewGame(String name, String date,int seasonIndex, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
		this.season.get(seasonIndex).createGame(name, date, sadiumCapacity, vipTicketPrice, clubLevelTicketPrice, bleachersTicketPrice, seasonTicketPrice, stadium);
		db.createGameDB(name, date, this.season.get(seasonIndex));
	}

	//when calling create new game via controller need to remember to update DB (to call createGameDB method)
	//when calling updateGameSectionsoldTickets need to remember to update DB (to call updateGameSectionSoldTicketsDB method)

}
