package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//innertext //text
//		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
//		driver.findElement(By.xpath("")).click();
	
		
		//attribute
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		
		//contains attribute 
//		driver.findElement(By.xpath("//i[contains(@class,'fa fa-youtube')]")).click();
		
		//contains text
//		driver.findElement(By.xpath("//a[contains(text(),'Video Tutorials')]")).click();
		
		//start-with
//		driver.findElement(By.xpath("//i[starts-with(@href='/login')]")).click();
		
		//hybrid
//		driver.findElement(By.xpath("//i[@class='fa fa-envelope' or @text()=' Contact us']")).click();
	
		Thread.sleep(2000);
		driver.quit();
		
	}
}
