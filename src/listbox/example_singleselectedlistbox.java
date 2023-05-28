package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_singleselectedlistbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement opt=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select s=new Select(opt);
		//s.selectByVisibleText("Aug");
       // s.selectByIndex(5);
		s.selectByValue("6");
		String s1=s.getFirstSelectedOption().getText();
		System.out.println(s1);
	}

}
