package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_popup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("125436");
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		Alert alt=driver.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		//alt.dismiss();
	alt.accept();
	alt.accept();
	}

}
