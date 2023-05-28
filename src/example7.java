import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example7 {

	public static void main(String[] args) 
	{

WebDriver Driver =new FirefoxDriver();
Driver.get("https://www.youtube.com/");
String url=Driver.getCurrentUrl();
System.out.println(url);
	}

}
