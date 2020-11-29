package week5.Day1;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	
	  @BeforeTest 
	  public void setFile() 
	  { 
		  excelFilename="EditLeadTestData"; 
	  }
	 

	  	@Test(dataProvider = "Data")
	// @Test(dataProvider = "EditData")
	// (dependsOnMethods = "week5.Day1.CreateLead.runCreateLead")
		public void runEditLead(String phoneNo, String compName) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(compName);
		driver.findElementByName("submitButton").click();
	}

	/*
	 * @DataProvider(name = "EditData") public String[][] sendEditData() throws
	 * IOException { //String[][] data = ReadExcel.ReadData(); String[][] data = new
	 * String[1][2];
	 * 
	 * data[0][0] = "9"; data[0][1] = "TCS";
	 * 
	 * return data;
	 * 
	 * }
	 */
}
