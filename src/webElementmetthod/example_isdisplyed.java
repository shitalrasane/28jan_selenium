package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_isdisplyed {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		WebElement logo= driver.findElement(By.xpath("//img[@alt=\"logo\"]"));
		boolean result=logo.isDisplayed();
		System.out.println(result);
if(result)
{
System.out.println("logo on paytm application is present");	
}
else
{
	System.out.println("logo on paytm application is not present");
}
driver.findElement(By.xpath("(//div[@class=\"_2EGQY cqA0P\"])[2]")).click();
Thread.sleep(2000);
WebElement electricity=driver.findElement(By.xpath(("(//img[@alt=\"image\"])[2]")));
Thread.sleep(2000);
boolean b=electricity.isDisplayed();
System.out.println(b);
if(b)
{
System.out.println("logo of electricity is present");	
}
else
{
System.out.println("logo of electricity is not present");	
}
}
	}


