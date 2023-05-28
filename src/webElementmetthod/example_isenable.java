package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_isenable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
	boolean b	=driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
System.out.println(b);
if(b)
{
System.out.println("element is enabale");	
}
else
{
System.out.println("element is disable");	
}
	}

}
