package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_oflisttoupper {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(3000);
WebElement we=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
Select s=new Select(we);
s.selectByVisibleText("Jan");
List<WebElement>L=s.getOptions();
for(WebElement web:L)
{
System.out.println(web.getText().toUpperCase());	
}
	
	}

}
