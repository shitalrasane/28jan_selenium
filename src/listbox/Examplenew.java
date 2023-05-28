package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Examplenew {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
	WebElement we=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
	Thread.sleep(2000);
	Select s=new Select(we);
//s.selectByValue("red");
s.selectByIndex(3);
WebElement web=s.getFirstSelectedOption();
System.out.println(web.getText());

List<WebElement>l=s.getOptions();
System.out.println(l.size());
for(WebElement w:l)
{
System.out.println(w.getText());	
}
boolean b=s.isMultiple();
System.out.println(b);
if(b)
{
	System.out.println("list box is mulyiselected");

}else
{
	System.out.println("listbox is single selected");

}


	}

}
