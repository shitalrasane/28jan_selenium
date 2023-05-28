package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_lastindexrow 
{ 
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Shital\\\\Downloads\\\\poi-bin-5.2.3-20220909 (1)(2)\\\\poi-bin-5.2.3\\\\28jan.xlsx");
		Workbook book=WorkbookFactory.create(file);
		int Rnum=book.getSheet("Sheet1").getLastRowNum()+1; //size of no of rows
	System.out.println(Rnum);
	int cnum=book.getSheet("Sheet1").getRow(0).getLastCellNum();
}

}
