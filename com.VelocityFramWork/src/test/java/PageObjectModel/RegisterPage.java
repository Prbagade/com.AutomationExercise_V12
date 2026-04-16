package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//*[@id='-FirstName']")
	WebElement txt_Fname;

	@FindBy(xpath = "//*[@id='-LastName']")
	WebElement txt_Lname;

	@FindBy(xpath = "//*[@id='-email']")
	WebElement txt_emailID;

	@FindBy(xpath = "//*[@id='-password']")
	WebElement txt_Password;

	@FindBy(xpath = "//*[@value='Register']")
	WebElement btn_Register;

	public void EnterFname(String fname) {
		txt_Fname.sendKeys(fname);
	}

	public void EnterLname(String lname) {
		txt_Lname.sendKeys(lname);
	}

	public void EnterEmailID(String email) {
		txt_emailID.sendKeys(email);
	}

	public void EnterPassword(String pass) {
		txt_Password.sendKeys(pass);
	}

	public void ClickOnRegister() {

		btn_Register.click();
	}

}
