/*
Vaibhav Sharma
=====================================
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class fnc {
	
	public boolean prime(int a){
		int i,c=0;
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
					c++;
			}
			if(c==2)
			{
				return true;
			}
			else 
				return false;
				
		}
	
public boolean even(int a)
{
	if (a%2==0)
		return true;
	return false;
}

public void setinprime(int x, int i)
{
	
	try {
		
		File f = new File("D:\\New folder\\new2.xlsx");
		FileInputStream fis;
		fis = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet2");
		
		XSSFRow row1 = sh.createRow(i);
		XSSFCell cell1= row1.createCell(0);
		cell1.setCellValue(x);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void setineven(int x, int i)
{
	
	try {
		
		File f = new File("D:\\New folder\\new2.xlsx");
		FileInputStream fis;
		fis = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet3");
		
		XSSFRow row1 = sh.createRow(i);
		XSSFCell cell1= row1.createCell(0);
		cell1.setCellValue(x);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void setinodd(int x, int i)
{
	
	try {
		
		File f = new File("D:\\New folder\\new2.xlsx");
		FileInputStream fis;
		fis = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet4");
		
		XSSFRow row1 = sh.createRow(i);
		XSSFCell cell1= row1.createCell(0);
		cell1.setCellValue(x);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


}


