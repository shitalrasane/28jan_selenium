package ScrrenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 
{ 
	public static void main(String[] args) throws IOException
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http:/www.google.com/");

	File srs=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
	System.out.println(srs);
	File des=new File("C:\\Users\\Shital\\Desktop\\scrrenshot\\abc2.jpg");
     FileHandler.copy(srs,des);
	
	

	}
}
