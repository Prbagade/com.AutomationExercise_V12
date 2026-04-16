package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// select list
		WebElement listBox = driver.findElement(By.xpath("//*[@id='colors']"));

		Select sl = new Select(listBox);

//		sl.selectByIndex(2);
//		sl.selectByVisibleText("Yellow");
//		sl.selectByValue("red");

		// get all options
		List<WebElement> ops = sl.getOptions();

//		for (WebElement sb : ops) {
//			System.out.println(sb.getText());
//		}

		for (int i = 0; i <= ops.size(); i++) {
			System.out.println(ops.get(i).getText());
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
