package instollation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_3581b68572144622b52fd4aa0cb656df7c6292eda9d4c6a6b0a6bf3d&mfadid=adm");
		Thread.sleep(2000);
driver.close();
	}

}
