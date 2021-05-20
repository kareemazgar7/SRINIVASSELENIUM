package exercise;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Exceltodataprovider {

	@DataProvider(name= "searchData")
	public String[][]readfromExcel() throws Exception{
		
		XSSFWorkbook workbook = new XSSFWorkbook("Ali.xlsx");
		 XSSFSheet  sheet = workbook.getSheet("Testdata1");
		 int rows = sheet.getPhysicalNumberOfRows();
		 XSSFRow row = sheet.getRow(0);
		 int cols = row.getPhysicalNumberOfCells();
		 String [][] dataset = new String [rows] [cols];
		 for(int r =0; r <rows; r++) {
			 row = sheet.getRow(r);
			for(int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.getStringCellValue() + "\t");
				dataset[r][c] = cell.getStringCellValue();
			}
			System.out.println();
		 }
		 workbook.close();
		 return dataset;
	}
}
