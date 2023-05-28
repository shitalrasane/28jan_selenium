package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_custmizelistbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/cabs");
		Thread.sleep(2000);
		WebElement cab=driver.findElement(By.xpath("(//input[@spellcheck=\"false\"])[5]"));
		cab.click();
		//cab.sendKeys("Mumbai");
		//cab.sendKeys(Keys.ARROW_DOWN);
		cab.sendKeys(Keys.ARROW_DOWN);
		//Select s=new Select(cab);
		//s.selectByIndex(2);
		//cab.sendKeys("Mumbai");

	}

}
