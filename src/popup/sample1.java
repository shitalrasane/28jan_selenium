package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	Set<String>ids=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(ids);
	
	Thread.sleep(2000);
	
	driver.switchTo().window("a1.get(1)");
	
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	
	
	}

}
