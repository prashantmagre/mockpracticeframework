package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {

	@FindBy(xpath = "//*[text()='ADD TO CART']")private WebElement addToCart;
	
	WebDriver driver;
	WebDriverWait wait;
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnAddToCart()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		addToCart.click();
	}
	
}
