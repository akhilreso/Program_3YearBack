package packge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling 
{
  public static void main(String[] args) throws IOException {
	  File file=new File("./exelFiles/first.xlsx");
	  Workbook wb=new XSSFWorkbook();
	  org.apache.poi.ss.usermodel.Sheet sht = wb.createSheet("Automation Report");
	  Row row = sht.createRow(1);
	  Cell cl1 = row.createCell(0);
	  cl1.setCellValue("Manual Execute");
	  Cell cl2 = row.createCell(1);
	  cl2.setCellValue(100);
	  FileOutputStream fo = new FileOutputStream(file);
	  wb.write(fo);
	  System.out.println("Dta return");
}



}