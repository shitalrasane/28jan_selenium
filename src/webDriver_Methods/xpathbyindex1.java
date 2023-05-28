package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyindex1 
{
	public static void main(String[]args) throws InterruptedException
	
	{
 WebDriver driver=new FirefoxDriver();
 driver.get("http://www.facebook.com/");
 String s=driver.getTitle();
 System.out.println(s);
String s1= driver.getCurrentUrl();
System.out.println(s1);
driver.navigate().to("https://www.youtube.com/");
Thread.sleep(3000);
driver.navigate().back();
driver.navigate().forward();
driver.manage().window().maximize();
driver.close();
//driver.manage().window().minimize();
		
		
		
	}

}

