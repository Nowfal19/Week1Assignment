package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] getData(String excelfilename) throws IOException {
		
		//OPen a file 
		XSSFWorkbook book = new XSSFWorkbook("./data/"+excelfilename+".xlsx");
		
		//Go to the Sheet 
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//Find number of Rows 
		int rowCount = sheet.getLastRowNum();
		System.out.println("No of Rows: "+ rowCount);
		
		//Find the Number of Columns 
		XSSFRow row = sheet.getRow(0);
		short colCount = row.getLastCellNum();
		System.out.println("No of columns: "+ colCount);
		
		//Create an Empty 2D for store all the data 
		String[][] data = new String[rowCount][colCount];
		
		//Go to Each cell to read the Data 
	    for (int i=1;i<=rowCount; i++) {
	    	XSSFRow eachrow = sheet.getRow(i);
	    	for(int j=0; j<colCount; j++) {
	    		XSSFCell cell = eachrow.getCell(j);
	    		String Value = cell.getStringCellValue();
	    		data[i-1][j] = Value;
	    		System.out.println(Value);
	    	}
	    		
	    }
		book.close();
		return data;
	}
}
