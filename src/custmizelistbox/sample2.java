package custmizelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class sample2 {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
	WebElement country=	driver.findElement(By.xpath("//select[@name=\"country\"]"));
	//country.click();
	Thread.sleep(2000);
	
	

((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	Actions Act=new Actions(driver);
	
	Thread.sleep(2000);
	
	Act.click(country).perform();
	
	Thread.sleep(2000);
	
	Act.sendKeys(country,Keys.ARROW_UP).perform();
	//Thread.sleep(2000);
	//Act.sendKeys(country,Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	
	Act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
	}

}
