package webDriver_Methods;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample6 {

	public static void main(String[] args) 
	{
		FirefoxDriver  driver =new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String s1=driver.getTitle();
        System.out.println(s1);
        String s2=driver.getCurrentUrl();
        System.out.println(s2);
        driver.manage().window().maximize();
        driver.navigate().refresh();
	}

}
