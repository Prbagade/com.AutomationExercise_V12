package com.TestCases;

import org.testng.annotations.Test;

import com.PageObject.HomePage;
import com.PageObject.LoginPage;
import com.TestBase.BaseClass;

public class TC002_LoginPageTest extends BaseClass{

	
	
	@Test
	public void Verify_LogIn_Account() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSignIn();
		
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserEmailID("prafulbagade4@gmail.com");
		lp.EnterPassword("Praful@1234");
		lp.ClickOnLogin();
		
		Thread.sleep(1000);
		hp.VerifyProfilName();
		
		
		Thread.sleep(1000);
		hp.ClickOnLogOut();
		
	}
}
