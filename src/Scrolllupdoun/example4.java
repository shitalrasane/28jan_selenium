package Scrolllupdoun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example4 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/newtours/register.php ");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		WebElement con=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Actions act=new Actions(driver);
		
		act.click(con).perform();
		Thread.sleep(2000);
		
		act.sendKeys(con,Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER);
		
}
}