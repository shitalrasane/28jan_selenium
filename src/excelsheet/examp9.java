package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class examp9 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
	
	Workbook book=WorkbookFactory.create(file);
int tr=	book.getSheet("Sheet2").getLastRowNum();
int lc=book.getSheet("Sheet2").getRow(0).getLastCellNum();
System.out.println(tr);
System.out.println(lc);
System.out.println("---------------------------------------------------");
System.out.println("All data of colun 0 of sheet2");
for(int i=0;i<=tr-1;i++)
{
System.out.println(book.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue());	

}
System.out.println("---------------------------------------------------");
System.out.println("All data of row 0 of Sheet2");
	for(int j=0;j<=lc-1;j++)
	{
		System.out.println(book.getSheet("Sheet2").getRow(0).getCell(j).getStringCellValue());
	}
	
	
	
	
	}

}
