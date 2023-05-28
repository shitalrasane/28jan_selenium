package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example2 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("pen");
	Thread.sleep(2000);
	List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
	String s="pendrive";
	for(WebElement web:alloptions)
	{
		String s1=web.getText();
		
		if(s.equals(s1))
		{
			
		web.click();
		break;
		}
	}
	
	

	}

}
