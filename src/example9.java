import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class example9 {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//File srs=(TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		
		File n=new File("C:\\Users\\Shital\\Desktop\\scrrenshot\\nature.jpg");
		FileHandler.copy(s,n);

	}

}
