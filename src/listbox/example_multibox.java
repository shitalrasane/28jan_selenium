package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_multibox {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Shital/Desktop/mulbox.html");
		WebElement mul=driver.findElement(By.xpath("//select[@id=\"12354\"]"));
	Select s=new Select(mul);
	s.selectByIndex(2);
	s.selectByIndex(0);
	s.selectByVisibleText("Pak");
	s.deselectByIndex(0);
	

	}

}
