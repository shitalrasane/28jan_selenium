package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
	Workbook book=WorkbookFactory.create(file);
	String s=book.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
	System.out.println(s);
	String s1=book.getSheetName(0);
	System.out.println(s1);
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http:/www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(s);

	}

}
