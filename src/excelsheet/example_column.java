package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example_column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook Book=WorkbookFactory.create(file);
Sheet sh=Book.getSheet("Sheet2");
int lr=sh.getLastRowNum();
for(int i=0;i<=lr;i++)
{
String s=sh.getRow(i).getCell(0).getStringCellValue();	
System.out.println(s);
}

	}

}
