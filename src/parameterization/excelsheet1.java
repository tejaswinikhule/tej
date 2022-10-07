package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet1 
{      //how to fetch /read/ retrive excel sheet
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach to the excelsheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		//to  fetch the info
		String info=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(info);
	
		

	}

}
