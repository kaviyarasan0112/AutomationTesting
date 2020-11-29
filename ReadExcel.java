package week5.Day1;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] ReadData(String Filename) throws IOException {
		// to get into the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./TestData/"+Filename+".xlsx");
		//To get the sheetName
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//To get the sheet using index
		//XSSFSheet sheetAt = wb.getSheetAt(0);
		//To get into the row of the sheet
		//XSSFRow row = sheet.getRow(1);
		//To get the value from the cell
		//XSSFCell cell = row.getCell(1);
		//To get the values from the cell
		//String stringCellValue = cell.getStringCellValue();
		//System.out.println(stringCellValue);
		
		//To get the rowcount of the excelSheet
		//getLastRowNum() - while getting the row count it will exclude the header 
		int rowCount = sheet.getLastRowNum();
		//System.out.println(rowCount);
		
		//To get the all the row values, we can use getPhysicalNumberOfRows method
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		//System.out.println(physicalNumberOfRows);
		
		//to get the count of column
		short cellCount = sheet.getRow(0).getLastCellNum();
		//System.out.println(cellCount);
		
		String[][] data=new String[rowCount][cellCount];
		
		for (int i = 1; i <=rowCount ; i++) {
			for (int j = 0; j < cellCount; j++) {
				String cellvalues = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cellvalues;
			}
			
		}
		wb.close();
		return data;	
	}

}
