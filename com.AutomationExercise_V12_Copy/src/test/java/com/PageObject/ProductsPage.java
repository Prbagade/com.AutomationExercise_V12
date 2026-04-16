package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage  {

	public ProductsPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='search_product']" ) WebElement txt_SearchProducts; 
	@FindBy(xpath = "//button[@id='submit_search']" ) WebElement btn_search; 
	@FindBy(xpath = "//*[@class='productinfo text-center']//img" ) WebElement imgs_results; 
	@FindBy(xpath = "//*[@class='btn btn-default add-to-cart']" ) WebElement btn_addTocart; 
	@FindBy(xpath = "//button[text()='Continue Shopping']" ) WebElement btn_contiShopping; 
	
	
	public void EnterProducts(String prod) 
	{
		txt_SearchProducts.sendKeys(prod);
	}
	public void ClickOnSearch() 
	{
		btn_search.click();
	}
	public void VerifyResults() 
	{
		
		System.out.println( imgs_results.getSize()); 
	}
	public void ClickOnAddTocart() 
	{
		btn_addTocart.click();
	}
	public void ClickOnContinueShop() 
	{
		btn_contiShopping.click();
	}
	
	
	
	

	
}
