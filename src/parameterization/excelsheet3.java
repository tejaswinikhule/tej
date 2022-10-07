package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach to the excelsheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		//to  fetch the info
		boolean value=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(value);
		

	}


}
