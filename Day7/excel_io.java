/*
Vaibhav Sharma
==================================

*/



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

//import com.sun.java.util.jar.pack.Package.File;


public class excel_io {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			File f = new File("D:\\New folder\\new.xlsx");
			FileInputStream fis =new FileInputStream(f);
			XSSFWorkbook wb= new	XSSFWorkbook(fis); 
			XSSFSheet sh = wb.getSheet("Sheet1");
//			XSSFRow row= sh.getRow(0);
//			XSSFCell cell =row.getCell(0);
//			
			XSSFRow row1 = sh.createRow(1);
			XSSFCell cell1= row1.createCell(0);
			//cell1.setCellValue("GlobalLogic");
			
			
			
		//	String s = cell.getStringCellValue();
		//	System.out.println("Data : "+s);
			
			FileOutputStream fos = new FileOutputStream(f);
		//	cell.setCellValue("Noida");
			wb.write(fos);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
