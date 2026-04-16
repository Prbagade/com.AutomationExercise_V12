package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

	
	public PaymentPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[text()='Pay and Confirm Order']") WebElement btn_PayAndConf;
	@FindBy(xpath = "//*[@name='name_on_card']") WebElement txt_NameOnCard;
	@FindBy(xpath = "//*[@data-qa='card-number']") WebElement txt_CardNum;
	@FindBy(xpath = "//*[@data-qa='cvc']") WebElement txt_Cardcvc;
	@FindBy(xpath = "//*[@name='expiry_month']") WebElement txt_Expiry;
	@FindBy(xpath = "//*[@name='expiry_year']") WebElement txt_Years;
	
	
	
	public void EnterNameOnCard(String cardName) 
	{
		txt_NameOnCard.sendKeys(cardName);
	}
	public void EnterCardNum(String cardNum) 
	{
		txt_CardNum.sendKeys(cardNum);
	}
	public void EnterCVCnum(String cvc) 
	{
		txt_Cardcvc.sendKeys(cvc);
	}
	public void EnterExpiry(String exp) 
	{
		txt_Expiry.sendKeys(exp);
	}
	public void EnterYears(String yr) 
	{
		txt_Years.sendKeys(yr);
	}
	
	public void ClickOnPayAndConf() 
	{
		btn_PayAndConf.click();
	}
}
