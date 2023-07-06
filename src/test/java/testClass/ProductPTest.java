package testClass;

import org.testng.annotations.Test;

import extentListeners.TestNGListeners;

public class ProductPTest extends TestNGListeners{

	
	@Test(priority = 3)
	public void applyFilters()
	{
	productpage.applyFilters();
	test.info("select all filters");
	}
	
	@Test(priority = 4)
	public void reset()
	{
		productpage.resetFilter();
		
		test.info("Reset the filter");
	}
	
	@Test(priority = 5)
	public void sortingFilter() throws InterruptedException
	{
		productpage.sortingByValue("Price High to Low");
		
		test.info("Sorting the product from high to low");
		
		//Thread.sleep(3000);
				
//		productpage.sortingByValue("Name Z - A");
//		
//		test.info("Sorting the product from A-Z");
	}

	@Test(priority = 6)
	public void navToProduct()
	{
		
		
		productpage.clickOnProduct();
		
		test.info("Clicked on the product");
	}
	
	
	
	
}
