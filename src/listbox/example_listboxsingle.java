package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_listboxsingle {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
	Select s=new Select(month);
	//driver.findElement(By.xpath("//select[@title=\"Month\"]")).sendKeys("Dec");
	WebElement first=s.getFirstSelectedOption();
	System.out.println(first.getText());
	List<WebElement>  mon=s.getOptions();
	int size=mon.size();
	System.out.println(size);
	for(WebElement s1:mon)
	{
		System.out.println(s1.getText());
	}

	}

}
