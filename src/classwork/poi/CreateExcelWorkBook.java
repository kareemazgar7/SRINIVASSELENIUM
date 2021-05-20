package classwork.poi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelWorkBook {

	public static void main(String[] args) throws Exception {
		String[][] dataToExcel = { { "Casual Dresses", "mail1@mymail.com" },
								   { "winter dresses", "mail2@mymail.com" },
								   { "Summer dresses", "mail3@mymail.com" },
								   { "T-Shirts", "mail4@mymail.com" },
								};
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");
		for(int r=0; r < 4; r++) { //0, 1
			XSSFRow row = sheet.createRow(r);
			for(int c=0; c < 2; c++) { // 0, 0
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(dataToExcel[r][c]); //[0][0], [0][1], [1][0]
			}
		}
		FileOutputStream out = new FileOutputStream("MyData.xlsx");
		workbook.write(out);
		workbook.close();
		out.close();
		System.out.println("File created");

	}

}
