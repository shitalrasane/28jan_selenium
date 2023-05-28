package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
	}

}
