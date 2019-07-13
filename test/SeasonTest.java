package test;
import model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class SeasonTest extends TestCase {
	Stadium stadium;
	Season season;
	Section[] section;
	@BeforeEach
	protected void setUp() throws Exception {
		season = new Season("Season Test", "League Test");
		section = new Section[40];
		stadium = Stadium.getInstance(1, "stadiumName", "homeTeam", 12000, "address",10, section);
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	void testCreateGame() {
		season.createGame("testGameName", "testGameDate", stadium.getCapacity(), 100, 50, 20, 350, stadium);
		assertNotNull("game is not null", season.games.get(0));
	}

}
