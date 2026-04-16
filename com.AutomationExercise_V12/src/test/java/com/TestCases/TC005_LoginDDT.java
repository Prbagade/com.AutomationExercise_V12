package com.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.HomePage;
import com.PageObject.LoginPage;
import com.TestBase.BaseClass;
import com.Utilities.DataProviders;

public class TC005_LoginDDT extends BaseClass{
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void Verify_LogInDDT(String email, String pwd, String exp) throws InterruptedException 
	{
		logger.info("********Starting TC002_LoginPageTest ***********");
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSignIn();
		logger.info("************Clicked On SignIn button***************");
		
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		
		logger.info("*********Entering login Credentials**************");
		lp.EnterUserEmailID(email);
		lp.EnterPassword(pwd);
		lp.ClickOnLogin();
		
		logger.info("**********Validate Profil Name**************");
		Thread.sleep(1000);
		hp.VerifyProfilName();
		
		
//		logger.info("***********Click on Logout button*************");
//		Thread.sleep(1000);
//		hp.ClickOnLogOut();
		
		if(exp.equalsIgnoreCase("valid")) 
		{
			hp.ClickOnLogOut();
			Assert.assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}
		if(exp.equalsIgnoreCase("Invalid")) 
		{
			hp.ClickOnLogOut();
			assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}
		
		
		logger.info("***********Finished Starting TC002_LoginPageTest*************");
		
	}
	
	
	
}
