package testClass;

import org.testng.annotations.Test;

import extentListeners.TestNGListeners;

public class ProductDetailsPageTest extends TestNGListeners{
	
@Test(priority=7)	
public void selectProduct()
{
	productdetailpage.clickOnAddToCart();
	test.info("Select the final product");
}
}
