package practise_purpose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xcel_column 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
   
	{
		
	FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");

	org.apache.poi.ss.usermodel.Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet6");
	
	
	int LastCellIndex= sh1.getRow(0).getLastCellNum()-1;
	
	for(int i=0; i<=LastCellIndex; i++)
	{
		String info= sh1.getRow(0).getCell(i).getStringCellValue();
		System.out.println(info);
	}
	  
	
	
	
	
	
	
	
	
	
	
}

}

