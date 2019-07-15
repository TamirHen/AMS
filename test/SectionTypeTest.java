package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Season;
import model.Section;
import model.Stadium;

public class SectionTypeTest extends TestCase {
	
	Stadium stadium;
	Section[] sectionArray;
	Section section;
	@BeforeEach
	protected void setUp() throws Exception {
		sectionArray = new Section[44];
		section = new Section(1, "1", "High", 20, false, 300, "Club Level");
		sectionArray[0] = section;
		stadium = Stadium.getInstance(1, "stadiumName", "homeTeam", 12000, "address",10, sectionArray);
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetArenaSection() {
		String expectedSection = "Club Level";
		String actualSection = stadium.getArenaSection(0).getSectionType();
		assertEquals(expectedSection, actualSection);
	}

}
