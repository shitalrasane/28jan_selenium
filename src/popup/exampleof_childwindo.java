package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exampleof_childwindo 
{
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
    driver.get("https://demo.guru99.com/");
    
    
    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abcd");





}
}
