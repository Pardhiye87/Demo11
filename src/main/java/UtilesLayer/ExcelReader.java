package UtilesLayer;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
     public XSSFWorkbook workbook;
//-------------------------------------------------------------------------------------------	
	public  ExcelReader(String path) throws Exception
	{
	File f =new File(path);
	FileInputStream fis = new FileInputStream(f);
    workbook=new XSSFWorkbook(fis);
	}
//-------------------------------------------------------------------------------------------------	
	public String getDataFromExcelSheet(int sheetindex,int rows,int cells)
	{
		try {
		return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getStringCellValue();
		}
		catch(Exception e){
			double d=workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getNumericCellValue();
		    return Long.toString((long) d);
		}
	}
	
//-----------------------------------------------------------------------------------------
	public  int countRow(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getLastRowNum();
	}
//-------------------------------------------------------------------------------------------	
	public  int countCell(int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
//----------------------------------------------------------------------------------------------	
	
	
}
