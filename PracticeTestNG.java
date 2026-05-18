package day44;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@AfterMethod
	public void login()
	{
		System.out.println("execute after method");
	}
	
	@Test
	public void signup()
	{
		System.out.println("Test case run...........");
	}
	
	@BeforeMethod
	public void close()
	{
		System.out.println("execute before method");
	}
	
	
	

}
