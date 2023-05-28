package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettextmethod {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String un=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(un);
		

	}

}
