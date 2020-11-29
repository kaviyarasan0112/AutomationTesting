package week5.Day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public  void assertion() {
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Open Browser");
		System.out.println("Enter UN");
		System.out.println("Enter Pwd");
		System.out.println("Login");
		Assert.assertEquals(true, true);
		System.out.println("Open HomePage");
		softAssert.assertEquals(false, true);
		System.out.println("Click on payment");
		System.out.println("Click on Recharge");
		softAssert.assertEquals(true, true);
		softAssert.assertAll();
		
		

	}

}
