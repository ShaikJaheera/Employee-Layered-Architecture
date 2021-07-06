package com.prodapt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws Exception {
		Employee emp= new Programmer("x",24);			        
	    	String actual= emp.create();
	    	String expected="created";
	    	assertEquals(expected,actual);
	    	
	   	}
	@Test
	void raiseTest() throws Exception{
		Employee emp=new Programmer("y"",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
    void testClerk() throws Exception{
    	Employee emp= new Clerk("Z",24);			        
    	String actual= emp.create();
    	String expected="created";
    	assertEquals(expected,actual);
    }
    @Test
	void raiseClerkTest() throws Exception{
		Employee emp=new Clerk("vv",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
	void raiseManagerTest() throws Exception{
		Employee emp=new Manager("vv",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
    void testManager() throws Exception{
    	Employee emp= new Manager("v",24);			        
    	String actual= emp.create();
    	String expected="created";
    	assertEquals(expected,actual);
    }
}
