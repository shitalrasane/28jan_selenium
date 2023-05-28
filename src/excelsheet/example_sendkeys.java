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

public class example_sendkeys 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook book=WorkbookFactory.create(file);
Sheet sh=book.getSheet("Sheet4");
String s=sh.getRow(0).getCell(0).getStringCellValue();
String s1=sh.getRow(1).getCell(0).getStringCellValue();
WebDriver driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(s);
driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(s);






}
}
