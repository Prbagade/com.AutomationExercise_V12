package Parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {

		//step 1
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Book1.xlsx");
		
		//step 2
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//step 3
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("totalrow: "+totalrows); //row counting from 0 
		System.out.println("totalcells: "+totalcells); //cell/column counting from 1
		
		for(int r=0;r<=totalrows;r++) 
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++) 
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
	