package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {

		//Auto suggested dropdown
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
		Thread.sleep(2000);
		
		List <WebElement> ele=driver.findElements(By.xpath("//*[@class='s-suggestion-container']"));

//		driver.findElement(By.xpath(""));
		
		Thread.sleep(1000);
		
//		System.out.println(ele.size()); //count of list
		
		for(int i=0;i<=ele.size();i++) 
		{
//			System.out.println(ss.getText()); // option print
			if(ele.get(i).getText().equalsIgnoreCase("Samsung s26")) 
			{
				ele.get(i).click();  //select action on ele
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
