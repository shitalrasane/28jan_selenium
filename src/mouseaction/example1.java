package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;



public class example1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/"); 
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		WebElement web=driver.findElement(By.xpath("//a[@href=\"/account/login?ret=/\"]"));
		
		
Actions act=new Actions(driver);

act.moveToElement(web).perform();




//driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
	

	}

}
