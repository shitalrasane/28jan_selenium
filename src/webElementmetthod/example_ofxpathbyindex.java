package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_ofxpathbyindex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("(//a[contains(@class,' _4jy0 ')])[1]")).click();
		Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Shital");
	}

}
