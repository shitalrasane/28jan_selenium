package Scrolllupdoun;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/register.php"); 


((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");


		
		
		
		
		
		
	}

}
