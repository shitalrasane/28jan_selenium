package instollation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdrivermethod {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	
	driver.navigate().to("https://www.youtube.com/");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);
	String title=driver.getTitle();
System.out.println(title);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.close();

	}

}
