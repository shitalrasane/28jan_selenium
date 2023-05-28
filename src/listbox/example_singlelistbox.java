package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_singlelistbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//select[@title=\"Day\"]"));
Select s=new Select(we);
s.selectByVisibleText("3");
List<WebElement> w=s.getOptions();
int a=w.size();
System.out.println(a);
for(WebElement s1:w)
{
	System.out.println(s1.getText());
	
}
String str=s.getFirstSelectedOption().getText();

System.out.println(str);
boolean b=s.isMultiple();
System.out.println(b);
if(b)
{
	System.out.println("list box is multi selected");
}
else
{
	System.out.println("list box is single selected");
}
	}

}
