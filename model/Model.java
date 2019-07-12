package model;
import java.util.Date;

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
	public Season season[];
	public int seasonSize;
	//---------------//
	//---set sponsors---//
	public Sponsor sponsors[];
	public int sponsorsSize;
	//-----------------//
	
	
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
		season=db.initializeSeasons();
		seasonSize=db.seasonSize;
		
		sponsors=db.initializeSponsors();
		sponsorsSize=db.sponsorsSize;
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
		this.season[seasonSize]=new Season(name, leagueName);
		this.seasonSize++;
		db.createNewSeasonDB(name, leagueName);
	}
	
	public void createNewSponsor(String name, Date contractStartDate, Date contractEndDate, float totalContractValue) {
		this.sponsors[sponsorsSize]=new Sponsor(name, contractStartDate, contractEndDate, totalContractValue);
		this.sponsorsSize++;
		db.createNewSponsorDB(name, contractStartDate,contractEndDate,totalContractValue);
	}
	//when calling create new game via controller need to remember to update DB (to call createGameDB method)
	//when calling updateGameSectionsoldTickets need to remember to update DB (to call updateGameSectionSoldTicketsDB method)

}
