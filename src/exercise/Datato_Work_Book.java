package exercise;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datato_Work_Book {

	public static void main(String[] args) throws Exception {
	
		String [][] datatoExcel = { {"causual dresses", "test1@.com"},
									{"winter dresses", "test2@.com"},
									{"summer dresses", "test3@.com"},
									{"man dresses", "test4@.com"},
				
		                            };
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Test Data");
		
		for(int r = 0; r < 4 ; r++){
			
			XSSFRow row = sheet.createRow(r);
			
			for ( int c = 0 ; c < 2 ; c++) {
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(datatoExcel[r][c]);
			}
		}
		
		FileOutputStream out = new FileOutputStream("My Data by me .xlsx");
		workbook.write(out);
		
		workbook.close();
		
		out.close();
		System.out.println("file created ");
	
		
		

	}
}
