package selenium_topic_practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data_from_excel {

	 public static void main(String agrs[]) throws IOException  {
		 FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-selenium\\Selenium_Practise\\Files\\Test.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(1).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(cellcount);
		
		for(int i=0;i<=rowcount;i++) {
		XSSFRow currentrow=	sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell=currentrow.getCell(j);
				System.out.print(cell + "\t");
			}
			System.out.println("");
		}
		workbook.close();
		file.close();
	 }
}
		