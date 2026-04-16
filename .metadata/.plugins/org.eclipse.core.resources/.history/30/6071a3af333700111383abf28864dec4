package com.TestCases;

import org.testng.annotations.Test;

import com.PageObject.AccountCreatedPage;
import com.PageObject.HomePage;
import com.PageObject.LoginPage;
import com.PageObject.RegisterPage;
import com.TestBase.BaseClass;

public class TC001_RegisterPageTest extends BaseClass{

	
	
	@Test
	public void Verify_Register_Account() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSignIn();
		
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserName("praful");
		lp.EnterEmailId("bantygot8@gmail.com");
		lp.ClickOnSignUp();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.SelectGender();
		rp.EnterPassword("April@1234");
		rp.SelectDate();
		rp.SelectMonth();
		rp.SelectYear();
		rp.EnterFirstname("Ganesh");
		rp.EnterLastname("Jadhav");
		rp.EnterAddess("Bhosari");
		rp.SelectCountry();
		rp.EnterState("Maharashtra");
		rp.EnterCity("Pune");
		rp.EnterZipcode("444105");
		rp.EnterMobileNum("9966007744");
		Thread.sleep(1000);
		rp.ClickOnCreateAcc();
		
		AccountCreatedPage myac = new AccountCreatedPage(driver);
		myac.validate_Acc();
		myac.ClickOnContineu();
		
		
	}
}
