package classwork.poi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	
	@DataProvider(name="searchData")
	public String[][] readExcel() throws Exception{
		
		XSSFWorkbook workbook = new XSSFWorkbook("MyData.xlsx");
		XSSFSheet sheet = workbook.getSheet("TestData");
		int rows = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int cols = row.getPhysicalNumberOfCells();
		String[][] dataSet = new String[rows][cols];
		for(int r = 0; r < rows; r++) {
			row = sheet.getRow(r);
			for(int c=0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.getStringCellValue() + "\t");
				dataSet[r][c] = cell.getStringCellValue();
			}
			System.out.println();
		}
		workbook.close();
		
		return dataSet;
		
	}

}
