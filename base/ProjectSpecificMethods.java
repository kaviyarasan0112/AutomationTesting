package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import utils.ReadExcel;

public class ProjectSpecificMethods {

	
	public ChromeDriver driver;
	public String excelFileName;
	public Properties prop;
		
	@Parameters({"language"})
	@BeforeMethod
	public void startApp(String language) throws IOException {
		//Load properties file
		FileInputStream fis = new FileInputStream("./src/test/resources/"+language+".properties");
		prop = new Properties();
		prop.load(fis);
		
		//WebDriver initialization		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcel.ReadData(excelFileName);

	}
}
