/*
Vaibhav Sharma
===================================


*/


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class sheet_prime_even_odd {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int p=0,ev=0,od=0;
		try {
			for(int j=0;j<10;j++)
			{
		File f = new File("D:\\New folder\\new2.xlsx");
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook wb = new	XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row= sh.getRow(j);
		XSSFCell cell =row.getCell(0);
		int s = (int) cell.getNumericCellValue();
		
		fnc fn=new fnc();
		
		if(fn.prime(s)== true){
			fn.setinprime(s, p);
			p++;
		}
		else if(fn.even(s)== true)
		{
			fn.setineven(s, ev);
			ev++;
		}
		
		else if(fn.even(s)== false)
		{
			fn.setinodd(s, od);
			od++;
		}
		}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
