package instollation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example2 {

	public static void main(String[] args) throws InterruptedException
	{
    WebDriver driver=new FirefoxDriver();
    driver.navigate().to("https://www.youtube.com/");
    driver.navigate().refresh();
    driver.get("https://www.facebook.com/");
    driver.navigate().back();
   Thread.sleep(4000);
    driver .navigate().forward();
   String url= driver.getCurrentUrl();
    System.out.println(url);
    String title=driver.getTitle();
    System.out.println(title);
    driver.manage().window().maximize();
    //driver.manage().window().minimize();
    driver.get("https://web.whatsapp.com/");
    Thread.sleep(4000);
   driver.manage().window().minimize();
   
   driver.close();
   driver.get("https://www.facebook.com/");
   
    driver.close();
    
    
	}

}
