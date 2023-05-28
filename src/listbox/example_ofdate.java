package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_ofdate {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	Thread.sleep(3000);
WebElement day=driver.findElement(By.xpath("//select[@title=\"Day\"]"));
Select date=new Select(day);
WebElement month=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
Select mon=new Select(month);
WebElement year=driver.findElement(By.xpath("//select[@title=\"Year\"]"));
Select yer=new Select(year);
date.selectByIndex(5);
Thread.sleep(2000);
mon.selectByVisibleText("Feb");
yer.selectByVisibleText("1991");

	}

}
