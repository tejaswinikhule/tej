package practise_purpose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xcel_row
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	
	FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh= WorkbookFactory.create(file).getSheet("Sheet6");
	                     
	                     int LastRowIndex =  sh.getLastRowNum();
	                     
	                     for(int i=0; i<=LastRowIndex; i++)
	                     {
	                    	 String info=  sh.getRow(i).getCell(0).getStringCellValue();
	                    	 System.out.println(info);
	                     }
	                     
}

	private static Object getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}