package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPlacedPage extends BasePage{

	
	public OrderPlacedPage (WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@class='btn btn-default check_out']") WebElement txt_invoice;
	@FindBy(xpath = "//*[@class='btn btn-primary']") WebElement txt_continue;
	
	public void ClickOnInvoice() 
	{
		txt_invoice.click();
	}
	public void ClickOnContinue() 
	{
		txt_continue.click();
	}
	
	
}
