package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_hiddendriven 
{
	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.flipkart.com/");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("7718859728");
	
	}

}
