package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example11 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
	Workbook book=WorkbookFactory.create(file);
	Sheet sh=book.getSheet("Sheet4");
	Cell cs=sh.getRow(1).getCell(0);
	CellType ct=cs.getCellType();
	if(ct==CellType.STRING)
	{
		
		String s=cs.getStringCellValue();
		System.out.println(s);
	}
	if(ct==CellType.BOOLEAN)
	{
		
		boolean b=cs.getBooleanCellValue();
		System.out.println(b);
	}
	if(ct==CellType.NUMERIC)
	{
		
		double n=cs.getNumericCellValue();
		System.out.println(n);
	}
}
}

