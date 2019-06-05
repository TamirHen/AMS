package arenaClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class Stadium {
	private int stadiumId;
	private String stadiumName;
	private String homeTeam;
	private int capacity;
	private String address;
	private Section[] arenaSection;

	// Constructor:
	public Stadium(int stadiumId, String stadiumName, String homeTeam, int capacity, String address) {
		this.setStadiumId(stadiumId);
		this.setStadiumName(stadiumName);
		this.setHomeTeam(homeTeam);
		this.setCapacity(capacity);
		this.setAddress(address);
		this.arenaSection = new Section[15];
		for (int i = 0; i < 15; i++) {
			arenaSection[i] = new Section("", 0, true, 0, "");
		}
	}

	// Data members getters and setters:
	public int getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Section getArenaSection(int sectionNumber) {
		return this.arenaSection[sectionNumber];
	}


}
