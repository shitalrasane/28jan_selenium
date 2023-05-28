package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_alldataofrow1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream file =new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");	
Workbook book=WorkbookFactory.create(file);
Sheet sh=book.getSheet("Sheet2");
int lc=sh.getRow(0).getLastCellNum();
for(int i=0;i<=lc-1;i++)
{
String s=sh.getRow(0).getCell(i).getStringCellValue();	
System.out.println(s);
}

	}

	
}
