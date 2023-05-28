package findelenmentsmethod;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Shital/Desktop/mcheckbox.html");
	List<WebElement> alcheckbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(WebElement s:alcheckbox)
	{
		s.click();
	}
	for(int i=0;i<=3;i++)
	{
		alcheckbox.get(i).click();
	}
	
	}
}
