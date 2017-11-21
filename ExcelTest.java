
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.text.SimpleDateFormat;
//Import POI classes
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
public class ExcelTest {
	
	public static void main(String[] args) {
		
		ExcelRead excel = new ExcelRead();
		for(int i = 0; i < 5; i++) {
			excel.printSheet(excel.getSheet(4));
		}
	}
	
	

	
/*
//Write
Workbook wb = new HSSFWorkbook();
CreationHelper create = wb.getCreationHelper();
Sheet s1 = wb.createSheet("newSheet");

//Creates row and fills the cells
Row row = s1.createRow((short) 0);
//Creates a cell and puts a value on it
Cell cell = row.createCell(0);
cell.setCellValue(1);
	//One line: row.createCell(arg).setCellValue(arg);

//Output to file
FileOutputStream fileOut = new FileOutputStream("output.xlsx");
wb.write(fileOut);
fileOut.close(); */
	
}