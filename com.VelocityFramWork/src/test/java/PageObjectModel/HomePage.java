package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class='my-account ts__05 pr dn db_md']") WebElement btn_SignIn;
	
//	@FindBy(xpath = "") WebElement xxx;
	
	
	public void ClickOnSignIn() 
	{
		btn_SignIn.click();
	}
	
}
