package ScrrenShot;



import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example2 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		String rs=RandomString.make(2);
	File srs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(srs);
	File des=new File("C:\\Users\\Shital\\Desktop\\scrrenshot\\"+"rs"+".jpg");
FileHandler.copy(srs,des);
	}

}
