package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelshhet4
{
	public static void main(String[] args) throws IOException ,EncryptedDocumentException
	{
		//to reach to the excelsheet
				FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
				//to  fetch the info
				
				int info = WorkbookFactory.create (file).getSheet("Sheet4").getLastRowNum();
				System.out.println(info);
		
	}

}
