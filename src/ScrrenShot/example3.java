package ScrrenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class example3 {

	

	public static void main(String[] args) throws IOException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.youtube.com");
	File sre=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(sre);
	File des=new File("C:\\Users\\Shital\\Desktop\\scrrenshot\\abc4.jpg");
	FileHandler.copy(sre,des);
	

	}

}
