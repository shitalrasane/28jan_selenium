package listbox;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_ofacendilistelebox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
   Thread.sleep(2000);
		WebElement we   =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
	Select s=new Select(we);
	List <WebElement>s1=s.getOptions();
	TreeSet tr=new TreeSet();
	
for(WebElement s2:s1)
{
String data=s2.getText();
tr.add(data);
}
for(Object o:tr)
{
System.out.println(o);	
}
}

	
	}
	


