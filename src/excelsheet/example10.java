package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file =new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
int lr=sh.getLastRowNum()+1;
System.out.println("size of row of ExcelSheet1 "+lr);

//System.out.println("size of cell of row 0 of ExcelSheet1 "+lc);

for(int i=0;i<=lr;i++)//ro by row
{
	Short lc=sh.getRow(i).getLastCellNum();
   for(int j=i;j<=lc;j++)
{
String s=sh.getRow(i).getCell(j).getStringCellValue();
System.out.println("total data of row "+s);
}
   
   
   
   
   
   
   
   
   
   
   
}System.out.println();



}




	}

	


