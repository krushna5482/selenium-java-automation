package com.testng;

import org.testng.annotations.Test;

/*
 *1)Open app
 *2)Login
 *3)Logout 
 
 
 
 
 
 */
public class FirstTestCase {
	
	@Test(priority = 1)
	void openapp()
	{
	System.out.println("open app");	
	}
	
	@Test(priority = 2)
	void login()
	{
	System.out.println("login app");	
	}
	
	@Test(priority = 3)
	void logout()
	{
	System.out.println("logout app");	
	}

}
