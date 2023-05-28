package Scrolllupdoun;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	

	}

}
