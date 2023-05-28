package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_iframe {

	public static void main(String[] args)  
	{
	WebDriver  driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//Thread.sleep(2000);
    driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	}

}
