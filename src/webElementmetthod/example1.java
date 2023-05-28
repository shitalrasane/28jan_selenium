package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.xpath("//input[@type=\"text\"]"));
un.sendKeys("abc");
un.clear();

	}

}
