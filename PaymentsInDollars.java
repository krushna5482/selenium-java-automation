package day44;

import org.testng.annotations.Test;

public class PaymentsInDollars {
	
	
@Test(priority = 1,groups = {"regression","sanity"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees");
	}
@Test(priority = 2,groups = {"regression","sanity"})
void paymentIndollers()
{
	System.out.println("Payment in dollers");
}
	
}
