package custmizelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
  WebDriver driver=new FirefoxDriver();
  driver.get("https://demo.guru99.com/test/newtours/register.php");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.manage().window().maximize();
 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
WebElement country= driver.findElement(By.xpath("//select[@name=\"country\"]"));

Actions act=new Actions(driver);
//Thread.sleep(2000);
act.click(country).perform();
Thread.sleep(2000);

act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);

 act.sendKeys(Keys.ENTER);
 
}
}