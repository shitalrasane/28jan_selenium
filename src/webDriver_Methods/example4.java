package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=amazon+india");
		driver.get("https://www.google.com/search?client=firefox-b-d&q=javatpoint+");
	driver.close();
	}

}
