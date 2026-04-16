package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath = "") WebElement sd;
	
//	@FindBy(xpath = "") WebElement sd;
	
	@FindBy(xpath = "//*[text()='Place Order']") WebElement btn_OrderPlaced;
	
	
	
	
	public void sd() 
	{
		
	}
	
	public void ClickOnPlaceOrder() 
	{
		btn_OrderPlaced.click();
	}
	
}
