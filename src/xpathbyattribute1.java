import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyattribute1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("patharkar.shital@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("shital01.");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
