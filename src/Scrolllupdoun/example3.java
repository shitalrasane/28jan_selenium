package Scrolllupdoun;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example3 {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");

((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");

	}

}
