package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Register
	@FindBy (xpath = "//*[@name='name']") WebElement txt_userName;
	
	@FindBy(xpath = "//*[@data-qa='signup-email']") WebElement txt_emailID;
	
	@FindBy(xpath = "//*[text()='Signup']") WebElement btn_signUp;

	//Login
	@FindBy (xpath = "//*[@data-qa='login-email']") WebElement txt_userEmailID;
	
	@FindBy(xpath = "//*[@data-qa='login-password']") WebElement txt_Password;
	
	@FindBy(xpath = "//*[@data-qa='login-button']") WebElement btn_Login;

	
	public void EnterUserName(String userName) 
	{
		txt_userName.sendKeys(userName);
	}
	public void EnterEmailId(String email) 
	{
		txt_emailID.sendKeys(email);
	}
	
	public void ClickOnSignUp() 
	{
		btn_signUp.click();
	}
	
	public void EnterUserEmailID(String userEmailID) 
	{
		txt_userEmailID.sendKeys(userEmailID);
	}
	public void EnterPassword(String pass) 
	{
		txt_Password.sendKeys(pass);
	}
	
	public void ClickOnLogin() 
	{
		btn_Login.click();
	}
	
}
