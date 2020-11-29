package week5.Day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	//public InternetExplorerDriver driver;
	public  String excelFilename;
	
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String userName,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		//String property = System.getProperty("webdriver.chrome.driver");
		//System.out.println(property);	
		driver = new ChromeDriver();
		 //driver=new InternetExplorerDriver();
		//to maximize the browser 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider(name = "Data")
	public String[][] sendData() throws IOException {
		return ReadExcel.ReadData(excelFilename);
	}

}
