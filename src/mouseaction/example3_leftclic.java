package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_leftclic {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		WebElement web=driver.findElement(By.xpath("//span[text()='Developers ']"));

		
		Actions act=new Actions(driver);
	act.click(web).perform();
	

	}

}
