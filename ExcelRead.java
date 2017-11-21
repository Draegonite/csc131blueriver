import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Iterator;
import java.text.SimpleDateFormat;

//Import POI classes
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class ExcelRead {

	private FileInputStream f;
	private XSSFWorkbook wb;
	
	//Empty Constructor
	public ExcelRead () {
		Scanner console = new Scanner(System.in);
		String fileName;
		System.out.print("Input filename and path: ");
		fileName = console.nextLine();
		try {
			this.f = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.wb = new XSSFWorkbook(this.f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	
	//Specified Constructor
	public ExcelRead(String fileName) {
		try {
			this.f = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.wb = new XSSFWorkbook(this.f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public XSSFWorkbook getWorkbook() {
		return this.wb;
	}
	
	public XSSFSheet getSheet(XSSFWorkbook excelWorkbook, int page) {
		XSSFSheet sheet = excelWorkbook.getSheetAt(page);
		return sheet;
	}
	
	public XSSFSheet getSheet(int page) {
		XSSFSheet sheet = this.wb.getSheetAt(page);
		return sheet;
	}
	
	public Row getRow(XSSFSheet sheet, int rowNum) {
		Row row = sheet.getRow(rowNum);
		return row;
	}
	
	public Cell getCell(Row row, int cellNum) {
		Cell cell = row.getCell(cellNum);
		return cell;
	}
	
	public void printRow(XSSFSheet sheet, int rowNum) {
		Row row = sheet.getRow(rowNum);
		Iterator<Cell> cellIterator = row.cellIterator();
		
		while(cellIterator.hasNext()) {
			Cell thisCell = cellIterator.next();
			int cellType = checkCell(thisCell);
			printCell(cellType, thisCell);
		}
		System.out.println("");
		
	}
	
	public int checkCell(Cell cell) {
		int cellType = cell.getCellType();
		return cellType;
	}
	
	public void printCell(int cellType, Cell cell) {
		switch(cellType) {
		
		case Cell.CELL_TYPE_NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
				System.out.print(date.format(cell.getDateCellValue()) + "\t");
			} else {
				System.out.print(cell.getNumericCellValue() + "\t");
			}
			break;
			
		case Cell.CELL_TYPE_STRING:
			System.out.print(cell.getStringCellValue() + "\t");
			break;
		}
	}
	
	public void printSheet(XSSFSheet sheet) {
		Iterator<Row> rowIterate = sheet.iterator();
		while(rowIterate.hasNext()) {
			Row row = rowIterate.next();
			Iterator<Cell> cellIterate = row.cellIterator();
			while(cellIterate.hasNext()) {
				Cell thisCell = cellIterate.next();
				int cellType = checkCell(thisCell);
				printCell(cellType, thisCell);
			}
			System.out.println("");
		}
	}
	
	
}
