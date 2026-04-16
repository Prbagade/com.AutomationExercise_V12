package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.MyAccountPage;
import PageObjectModel.RegisterPage;
import TestBase.BaseClass;

public class TC001_AccountRegisterTest extends BaseClass
{

	@Test
	public void Acc_Registration() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSignIn();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.ClickOnNewAcc();
		
		Thread.sleep(2000);
		RegisterPage rp = new RegisterPage(driver);
		rp.EnterFname("Prafull");
		rp.EnterLname("Bagade");
		rp.EnterEmailID("Prafulbagade4@gmail.com");
		rp.EnterPassword("Praful@1234");
		rp.ClickOnRegister();
		
		
		
//		Thread.sleep(2000);
//		MyAccountPage acc = new MyAccountPage(driver);
//		acc.validateProfil();
//		acc.ClickOnHome();
		
	}
	
	
}
