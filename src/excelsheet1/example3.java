package excelsheet1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook book=WorkbookFactory.create(file);
Sheet sh=book.getSheet("Sheet6");

int lr=sh.getLastRowNum();
System.out.println(lr);

System.out.println("-------------print all data of sheet6----------------");
for(int i=0;i<=lr;i++)
{
	int lc=sh.getRow(i).getLastCellNum();

	for(int j=0;j<=lc-1;j++)
	{
		Cell cs=sh.getRow(i).getCell(j);
		  CellType ct = cs.getCellType();
		  if(ct==CellType.BOOLEAN)
		  {
			 boolean b= cs.getBooleanCellValue();
			 System.out.print(b+" ");
			  
		  }
		  if(ct==CellType.STRING)
		  {
			 String s= cs.getStringCellValue();
			 System.out.print(s+" ");
			  
		  }
		  if(ct==CellType.NUMERIC)
		  {
			double n= cs.getNumericCellValue();
			 System.out.print(n+" ");
			  
		  }
		  
	}
	System.out.println();
	
}

	}

}
