package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods{
	

	@Test
	public void loginAndLogout() throws InterruptedException {
	//	LoginPage lp = new LoginPage();
		
		new LoginPage(driver,prop)
		.enterUsername("demosalesmanager")
		.enterPassword("crmsfa")
		.clickLogin();
		//.clickCrmsfaLink()
		//.clickLeadsLink();
		
	}


}
