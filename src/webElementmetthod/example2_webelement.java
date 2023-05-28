package webElementmetthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example2_webelement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(@href,'privacy_mutation_token')]")).click();
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();;

	}

}
