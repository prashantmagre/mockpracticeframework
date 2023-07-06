package testClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.HomeP;
import pages.ProductDetailsPage;
import pages.ProductP;
import utility.ConfigReader;

public class BaseTest {

	public static WebDriver driver ;
	public HomeP homepage;
	
	public ProductP productpage;
	public ProductDetailsPage productdetailpage;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		ConfigReader cr = new ConfigReader();
		String browsername = cr.readConfig("browser");
		if(browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
			
		// maximize the page
		
		driver.manage().window().maximize();
		
		
		
		String url = cr.readConfig("testsiteurl");
		
		driver.get(url);
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 homepage = new HomeP(driver);
		 productpage = new ProductP(driver);
		 productdetailpage = new ProductDetailsPage(driver);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
