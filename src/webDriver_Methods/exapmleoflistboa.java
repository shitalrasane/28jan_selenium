package webDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exapmleoflistboa {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
       Select s=new Select(we);
       
       s.selectByIndex(2);
	}

}
