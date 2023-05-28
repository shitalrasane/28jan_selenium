package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_ofalloption {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
         Select s=new Select(we); 
        // s.selectByValue("3");
        // s.selectByIndex(2);
         s.selectByVisibleText("4");
        List <WebElement>s1=s.getOptions();
   for(WebElement w:s1)
   {
	   System.out.println(w.getText());
   }
	}

}
