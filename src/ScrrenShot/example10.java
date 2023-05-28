package ScrrenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example10 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		String s=RandomString.make(2);
		File srs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(srs);
		File des=new File("C:\\Users\\Shital\\Desktop\\scrrenshot\\imag"+"s"+".jpg");
		FileHandler.copy(srs,des);
		

	}

}
