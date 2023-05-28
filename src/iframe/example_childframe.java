package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example_childframe 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		String s1=driver.findElement(By.xpath("//p[contains(text(),'You can use')]")).getText();
		System.out.println(s1);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]")));
		
		String s=driver.findElement(By.xpath("//h1[contains(text(),'displayed')]")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
		
	
	}

}
