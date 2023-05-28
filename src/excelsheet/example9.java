package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
	Workbook book=WorkbookFactory.create(file);
	Sheet sh=book.getSheet("abc");
	Row rw=sh.getRow(0);
	Cell cs=rw.getCell(2);
	//String s=cs.getStringCellValue();
	//Double d=cs.getNumericCellValue();
	//System.out.println(s);
	
	//System.out.println(d);
	Boolean b=cs.getBooleanCellValue(); 
	System.out.println(b);
	
	
}
}
