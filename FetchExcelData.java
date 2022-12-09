package week6.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchExcelData {

	public static String[][] main(String excelfilename) throws IOException {
		//Open the file
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+excelfilename+".xlsx");
		
       //Go to the sheet
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//Find the no of Rows
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: "+ rowCount);
		
		// Find Num of Cols
		XSSFRow headerRow = sheet.getRow(0);
		short colCount = headerRow.getLastCellNum();
		System.out.println("Column count : "+ colCount);
		
		//Create an empty 2D array to store a data 
		String[][] data = new String[rowCount][colCount];
	
		//go to eachcell and read the data
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
			XSSFCell eachCell = eachRow.getCell(j);
			String cellValue = eachCell.getStringCellValue();
			data[i-1][j]=cellValue;
			System.out.println("The cell value: "+ cellValue );
		}
	}
		book.close();
		return data;
	}
}


////Open the file
//		XSSFWorkbook book = new XSSFWorkbook("./testData/tc001.xlsx");
//		
//     //Go to the sheet
//		XSSFSheet sheet = book.getSheet("Sheet1");
//		
//		//Find the no of Rows
//		int rowCount = sheet.getLastRowNum();
//		System.out.println("Row Count: "+ rowCount);
//		
//		// Find Num of Cols
//		XSSFRow headerRow = sheet.getRow(0);
//		short colCount = headerRow.getLastCellNum();
//		System.out.println("Column count : "+ colCount);
//		
//		//go to eachcell and read the data
//		for (int i = 1; i <= rowCount; i++) {
//			XSSFRow eachRow = sheet.getRow(i);
//			for (int j = 0; j < colCount; j++) {
//			XSSFCell eachCell = eachRow.getCell(j);
//			String cellValue = eachCell.getStringCellValue();
//			System.out.println("The cell value: "+ cellValue );
//		}
//	}
//		book.close();