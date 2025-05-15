package utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadDataExcel2 {
	
	

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls"); // win/non-win machine
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//index ---- start 0
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		//Sheetname
//		HSSFSheet sheet = workbook.getSheet("smokeTest");
//		XSSFSheet sheet =workbook.getSheet("smokeTest");
		
		
		int rowCount = sheet.getLastRowNum();
		
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count: " + rowCount);
		System.out.println("column Count: " + columnCount);
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			System.out.println("details are: " + fName + " : " + address);
		}

	}

}
