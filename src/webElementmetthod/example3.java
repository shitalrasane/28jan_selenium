package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Shital/Desktop/New%20folder/signup.html");
		driver.findElement(By.xpath("(//input[@ type=\"radio\"])[1]")).click();
driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	}

}
