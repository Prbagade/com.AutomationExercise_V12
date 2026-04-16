package DemoSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement accDetail=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		// Mouse action
		Actions act = new Actions(driver);
		
		act.moveToElement(accDetail).perform();

		//DoubleClick
		WebElement taptap=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		act.doubleClick(taptap).perform();
//		act.contextClick(taptap).perform();
		
		//Drag and Drop
		Thread.sleep(1000);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop =driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, Drop).perform();
		
		
		//Keyboard action
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//*[@id='name']"));

		WebElement past=driver.findElement(By.xpath("//*[@id='email']"));
		
		act.sendKeys(user,"ganesh").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		past.click(); // to paste location
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
