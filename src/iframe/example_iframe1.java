package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class example_iframe1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen=\"true\"]")));
    driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();

	}

}
