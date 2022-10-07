package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1 
{
	//how to fetch/read/retrive the data from  excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach to the excelsheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		
		//to open excelsheet 
		Workbook book= WorkbookFactory.create(file);
		
		//to enter perticular sheet
		Sheet sh=book.getSheet("Sheet1");
		
		//to hilight row
		Row s1=sh.getRow(0);
		
		//to highlight column
		Cell s2=s1.getCell(0);
		
		// to fetch String information 
		String info=s2.getStringCellValue();
		System.out.println(info);
		
		
		
		
		
		
		
				
	}

}
