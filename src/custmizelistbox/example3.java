package custmizelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
	Thread.sleep(2000);
		
		act.sendKeys(month,Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
