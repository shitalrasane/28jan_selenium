package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class example_deselectoptionfrommultilistb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Shital/Desktop/New%20folder/mullistbox.html");
		WebElement we=driver.findElement(By.xpath("//select[@id='1234']")); 
		Select s=new Select(we);
		s.selectByIndex(0);
		//s.selectByValue(value);
		s.selectByVisibleText("Sri");
		s.selectByIndex(3);
		s.deselectByIndex(3);
		Thread.sleep(2000);
		s.deselectAll();
		boolean b=s.isMultiple();
		System.out.println(b);
		if(b)
		{
			System.out.println("listbox is multi selected");
		}
		else 
		{
			System.out.println("listbox is single selected");

		}

	}

}
