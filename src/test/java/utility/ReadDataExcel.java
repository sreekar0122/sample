package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {
	
	

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx"); // win/non-win machine
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//index ---- start 0
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Sheetname
//		XSSFSheet sheet =workbook.getSheet("smokeTest");
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
