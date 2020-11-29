package week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

	@Test
	public  void run() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		String property = System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		//To open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//to maximize the browser 
		driver.manage().window().maximize();
		//to load application url
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://leaftaps.com/opentaps/control/main");
		//to locate the element using Id locator 
		WebElement username =driver.findElementById("username");
		//type a value in a webelement
		username.sendKeys("demosalesmanager");
		//to type password in the password text field using id locator
		driver.findElementById("password").sendKeys("crmsfa");
		//locate element using name locator
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//to click on the login button
		driver.findElementByClassName("decorativeSubmit").click();
		//linkText locator for the html link elements(in <a> tag)
		driver.findElementByLinkText("CRM/SFA").click();
		//Click on link account
		driver.findElementByLinkText("Accounts").click();
		WebElement createAcc = driver.findElementByPartialLinkText("Create");
		String text = createAcc.getText();
		System.out.println(text);
		createAcc.click();
		
		
		WebElement accountname  = driver.findElementById("accountName");
		accountname.sendKeys("Debit Limited Account Test");
		
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementById("groupNameLocal").sendKeys("TestLocalName");
		driver.findElementByName("officeSiteName").sendKeys("TestSiteName");
		WebElement annualRevenue = driver.findElementByXPath("//input[ @id='annualRevenue' and @class='inputBox']");
		annualRevenue.sendKeys("1000");
		
		WebElement industry = driver.findElementByName("industryEnumId");
		
		Select ComputerSoftware=new Select(industry);
		ComputerSoftware.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select SCorporation=new Select(ownership);
		SCorporation.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElementById("dataSourceId");
		Select employee=new Select(source);
		employee.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElementById("marketingCampaignId");
		Select eCommerceSiteInternalCampaign=new Select(marketingCampaign);
		eCommerceSiteInternalCampaign.selectByIndex(6);
		
		
		
		WebElement state = driver.findElementById("generalStateProvinceGeoId");
		Select stateAndProvince=new Select(state);
		stateAndProvince.selectByValue("TX");
		
		driver.findElementByXPath("//input[ @type='submit']").click();

		
	}

}
