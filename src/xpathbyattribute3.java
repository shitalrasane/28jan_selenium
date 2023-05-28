import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyattribute3 {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.facebook.com/");
//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abv");
//driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("xyz");
//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
