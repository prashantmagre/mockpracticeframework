package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeP {

	@FindBy(xpath = "(//*[normalize-space(text())='WINES'])[2]")private WebElement wines;
	
	@FindBy(xpath = "(//*[text()='White Wine'])[2]")private WebElement whiteWine;
	
	private WebDriver driver;
	WebDriverWait wait;
	
	public HomeP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
		
	}
	
	
	public void clickOnWines() 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(wines));
		wines.click();
	}
	
	public void navToProductPage()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(whiteWine));
		whiteWine.click();
		
		
	}
	
	public String getTitleOfPage()
	{
		String titleofpage = driver.getTitle();
		
		return titleofpage;
	}
	
}
