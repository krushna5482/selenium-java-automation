package day43.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotatatinDemo {
/*
   ***********method
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority = 2)
	void advSearch()
	{
		System.out.println("This is advanced search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
	*/
	
	//**********class
	/*
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority = 2)
	void advSearch()
	{
		System.out.println("This is advanced search");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
	*/
	
	//**************Test
	/* @BeforeTest
	void login()
	{
		System.out.println("login");
	}
	@Test
	void search()
	{
		System.out.println("Run test case");
	}
	
	@Test
	void advsearch()
	{
		System.out.println("advanced search");
	}
	@AfterTest
	void logout()
	{
		System.out.println("logout");
	}
	*/
	
	//*****************SUIT********
	
	@Test
	void pqr()
	{
		System.out.println("this is pqr from ");
	}
	
	@AfterSuite
	void bs()
	{
		System.out.println("after suit");
	}
	
	@BeforeSuite
	void as()
	{
		System.out.println("before suit");
	}
	
	
	
	
}
