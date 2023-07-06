package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductP {
	
	@FindBy(xpath = "//*[@id='term-1965']")private WebElement brand;
	@FindBy(xpath = "//*[@id='term-76']")private WebElement country;
	@FindBy(xpath = "//*[@id='term-603']")private WebElement grape;
	@FindBy(xpath = "//*[@id='term-1526']")private WebElement grapeType;
	@FindBy(xpath = "//*[@id='term-324']")private WebElement region;
	@FindBy(xpath = "//*[@id='term-5']")private WebElement size;
	@FindBy(xpath = "//*[@id='term-23']")private WebElement style;
	@FindBy(xpath = "//*[@id='term-9']")private WebElement types;
	@FindBy(xpath = "//*[@id='term-436']")private WebElement vintage;
	@FindBy(xpath = "//*[text()='APPLY']")private WebElement applyButton;
	
	@FindBy(xpath = "//*[@class='btn btn-light rounded-pill text-dark w-100 py-2 wbr-reset-filter' and text()='RESET']")private WebElement resetButton;
	@FindBy(xpath = "//*[@id='ddlProductSortyBy']")private WebElement sortBy;
	@FindBy(xpath = "//*[text()='Price High to Low']")private WebElement price;
	@FindBy(xpath = "//*[@class='fw-500 m-0 text-dark ll-product-title' and text()='CHATEAU DE YQUEM']")private WebElement product;
	
	WebDriver driver;
	WebDriverWait wait;
	
	public ProductP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void applyFilters()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", brand);
	//	wait.until(ExpectedConditions.elementToBeClickable(country));
		js.executeScript("arguments[0].click();", country);
	//	wait.until(ExpectedConditions.elementToBeClickable(grape));
		js.executeScript("arguments[0].click();", grape);
	//	wait.until(ExpectedConditions.elementToBeClickable(grapeType));
		js.executeScript("arguments[0].click();", grapeType);
	//	wait.until(ExpectedConditions.elementToBeClickable(region));
		js.executeScript("arguments[0].click();", region);
	//	wait.until(ExpectedConditions.elementToBeClickable(size));
		js.executeScript("arguments[0].click();", size);
	//	wait.until(ExpectedConditions.elementToBeClickable(style));
		js.executeScript("arguments[0].click();", style);
	//	wait.until(ExpectedConditions.elementToBeClickable(vintage));
		js.executeScript("arguments[0].click();", vintage);
	//	wait.until(ExpectedConditions.elementToBeClickable(applyButton));
		js.executeScript("arguments[0].click();", applyButton);
		
		
		
	}

	
	
	public void resetFilter()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//wait.until(ExpectedConditions.elementToBeClickable(resetButton));
		js.executeScript("arguments[0].click();", resetButton);
//		Actions a=new Actions(driver);
//		a.moveToElement(resetButton).click().build().perform();
		
	}
	
	public void sortingByValue(String value)
	{
		//wait.until(ExpectedConditions.elementToBeClickable(sortBy));
		Select sel = new Select(sortBy);
		
		sel.selectByVisibleText(value);
	}
	
	
	
	public void clickOnProduct()
	{
		wait.until(ExpectedConditions.elementToBeClickable(product));
		//product.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", product);
	}
}
