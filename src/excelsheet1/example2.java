package excelsheet1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook book=WorkbookFactory.create(file);
Sheet sh=book.getSheet("sheet6");
int t=sh.getLastRowNum();
System.out.println(t);
System.out.println(t+1);
short s=sh.getRow(0).getLastCellNum();
System.out.println(s);	
System.out.print(s-1);
System.out.println("----------------------");
for(int i=0;i<=t;i++)
{
String s1=sh.getRow(i).getCell(0).getStringCellValue();	
System.out.println(s1);
}
System.out.println("-----row data-----");
for(int i=0;i<=s-1;i++)
{
	Cell cs=sh.getRow(0).getCell(i);
	CellType ct=cs.getCellType();
	if(ct==CellType.NUMERIC)
	{
		double d=cs.getNumericCellValue();
		System.out.println(d);
	}
	else if(ct==CellType.BOOLEAN)
	{
		boolean b=cs.getBooleanCellValue();
		System.out.println(b);
	}
	else	if(ct==CellType.STRING)
	{
		String s1=cs.getStringCellValue();
		System.out.println(s1);
	}
}

}
}
