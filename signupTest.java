package day44;

import org.testng.annotations.Test;

public class signupTest {

	@Test(priority = 1,groups = {"regression"})
	void signupbyemail()
	{
	  System.out.println("sign up by email");	
	}
@Test(priority = 2,groups = {"regression"})
void signupbyfacebook()
{
	System.out.println("sign up by facebook");
}

@Test(priority = 3,groups = {"regression"})
void signupbytwitter()
{
	System.out.println("sign up by twitter");
}


	
	
}
