package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//to reach to the excelsheet
				FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
				//to  fetch the info
				int ingo=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum();
				System.out.println(ingo);                                                     //-1 get minus 1 row
		
	}

}
