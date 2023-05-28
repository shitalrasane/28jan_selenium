package findelenmentsmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> allLink=driver.findElements(By.xpath("//a"));
		System.out.println(allLink.size());
		for(WebElement web:allLink)
		{
			System.out.println(web.getText());
		}
		System.out.println("----------25 web link on facebook page-----------");
		for(int i=0;i<=25;i++)
		{
			System.out.println(allLink.get(i).getText());
		}
		

	}

}
