package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1
{

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("redmi");
	Thread.sleep(2000);
	List<WebElement> l =driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
	System.out.println(l.size());
	String s1="redmi note 10 pro";
	
	for(WebElement web:l)
	{
		String s=web.getText();
		if(s.equals(s1))
		{
			web.click();
			break;
		}
	}
}
}
