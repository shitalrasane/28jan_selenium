import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
driver.get("https://web.whatsapp.com/");
String title=driver.getTitle(); 
System.out.println(title);
	}

}
