package com.TestCases;

import org.testng.annotations.Test;

import com.PageObject.HomePage;
import com.PageObject.ProductsPage;
import com.TestBase.BaseClass;

public class TC003_ProductPage extends BaseClass{

	
	@Test
	public void Verify_ProductPage() throws InterruptedException 
	{
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnProducts();
		
		Thread.sleep(1000);
		ProductsPage pd = new ProductsPage(driver);
		pd.EnterProducts("jeans");
		pd.ClickOnSearch();
		pd.VerifyResults();
		pd.ClickOnAddTocart();
		
		Thread.sleep(1000);
		pd.ClickOnContinueShop();
		
		
	}
}
