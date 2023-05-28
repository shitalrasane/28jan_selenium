package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example_ofmultiselectedlistbox {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
   driver.get("file:///C:/Users/Shital/Desktop/New%20folder/mullistbox.html");
  WebElement opt=driver.findElement(By.xpath("//select[@id='1234']"));
  Select s=new Select(opt);
  s.selectByIndex(3);
  s.selectByVisibleText("Sri");
  s.selectByIndex(2);
 String s1= s.getFirstSelectedOption().getText();
 System.out.println(s1);
 List<WebElement>allOptions=s.getAllSelectedOptions();
 
 
 for(WebElement w:allOptions)
 {
	 System.out.println(w.getText());
	 
		
 }
  
	}

}
