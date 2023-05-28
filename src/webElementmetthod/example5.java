package webElementmetthod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("7718859728");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mob");
		
		Thread.sleep(2000);
		List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1\"]/li"));
		
		String s="mobile";
		for(WebElement w:alloptions)
		{
			
		String s2=	w.getText();
		
		if(s.equals(s2))
		{
			w.click();
		}
		}

		
		String s1=driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).getAttribute("value");
		System.out.println(s1);
		
	//	driver.findElement(By.xpath("//button[text()='Verify']")).click();


	}

}
