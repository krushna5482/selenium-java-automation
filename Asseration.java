package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration {
	
	@Test
	void testasserstion()
	{
		String title1="krushna";
		String title2="krushna";
		Assert.assertEquals(title1,title2);
		
	}

}
