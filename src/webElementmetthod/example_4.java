package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
		Thread.sleep(3000);
	WebElement female=	driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]"));
		
female.click();
boolean b=female.isSelected();
System.out.println(b);
if(b)
{
System.out.println("female radio button is selected");	
}
else
{
	System.out.println("female radio button is not selected");	
}

}
	}