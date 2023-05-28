package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_drag_drop 
{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width=\"700\"]")));
		
		WebElement srs=driver.findElement(By.xpath("(//img[@height=\"72\"])[1]"));
		WebElement dec=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(srs, dec).perform();
		
		
	}

}
