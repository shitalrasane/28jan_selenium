package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> allotions=driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		System.out.println( allotions.size());
		String s="iphone 14 case";
		for(WebElement web:  allotions)
		{
			String s1= web.getText();
			if(s.equals(s1))
			{
				web.click();
				break;
			}
		}
		

	}

}
