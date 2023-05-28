package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example4 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("flower");
		List<WebElement>alloptions=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(alloptions.size());
		
		String s1="flower rangoli";
		for(WebElement web: alloptions)
		{
			String s=web.getText();
			if(s1.equals(s))
			{
				web.click();
			}
			
		}

	}

}
