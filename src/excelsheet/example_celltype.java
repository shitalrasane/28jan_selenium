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

public class example_celltype {


	private static CellType Numeric;
	private static CellType String;
	private static CellType Boolean;

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
Workbook book=WorkbookFactory.create(file);
Sheet sh=book.getSheet("Sheet3");
Cell cs0=sh.getRow(1).getCell(1);
CellType cy=cs0.getCellType();
System.out.println(cy);
if(cy==CellType.NUMERIC)
{
double d=sh.getRow(1).getCell(1).getNumericCellValue();	
System.out.println(d);
}
else if(cy==CellType.STRING)
{
	String s=sh.getRow(1).getCell(1).getStringCellValue();
	System.out.println(s);
}
else if(cy==CellType.BOOLEAN)
{
	boolean b=sh.getRow(1).getCell(1).getBooleanCellValue();
	System.out.println(b);
}
}
	}

	

