package excelsheet1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
	
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook book=WorkbookFactory.create(file);
boolean s=book.getSheet("Sheet6").getRow(0).getCell(2).getBooleanCellValue();
System.out.println(s);

}
}