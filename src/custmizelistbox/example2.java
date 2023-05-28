package custmizelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Actions act=new Actions(driver) ;
		Thread.sleep(2000);
		act.click(month).perform();
		
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(month, Keys.ARROW_DOWN).perform();
		
		
		
		
		
		
		
		
		
	}

}
