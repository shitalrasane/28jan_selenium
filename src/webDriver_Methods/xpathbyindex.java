package webDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyindex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("hi");
		
		
		
		
		
		

	}

}
