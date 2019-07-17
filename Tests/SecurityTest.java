package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Security;

class SecurityTest {
	
	private ArrayList<Security> securityList = new ArrayList<Security>();
	private String securityName;
	private String startDate;
	private String jobDescription;
	private float salary;
	private Security security;


	@BeforeEach
	void setUp() throws Exception {
		securityName = "John Smith";
		startDate = "01/01/2020";
		jobDescription = "Electrician";
		salary = 1000;
		security = new Security(securityName,startDate,jobDescription,salary);
		securityList.add(security);	
		}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void securityTest() {
		
		try
		{
			assertEquals(security, securityList.get(0));
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(securityName, securityList.get(0).getName());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(startDate, securityList.get(0).getContractStartDate());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(jobDescription, securityList.get(0).getJobDescription());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(salary, securityList.get(0).getSalary());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
	}

}
