package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_3581b68572144622b52fd4aa0cb656df7c6292eda9d4c6a6b0a6bf3d&mfadid=adm");
driver.manage().window().maximize();
String url=driver.getCurrentUrl();
System.out.println(url);
String Title=driver.getTitle();
System.out.println(Title);
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(2000);
driver.navigate().back();
driver.manage().window().maximize();
driver.navigate().forward();
driver.navigate().refresh();
driver.close();
String url1=driver.getCurrentUrl();
System.out.println(url1);
	}

}
