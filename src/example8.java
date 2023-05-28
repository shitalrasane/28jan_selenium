import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example8 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(4000);
	driver.navigate().to("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_ec67fdf5aba7fc010515a184771d9211d43ac93340af998ba3fbd662&mfadid=adm");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
	}

}
