package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet7 
{
	//to fetch particular row===========
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to reach to the excelsheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet6");
		//find last cell index
		int LastcellIndex = sh.getRow(0).getLastCellNum()-1;
		System.out.println(LastcellIndex);
		for(int i=0; i<=LastcellIndex; i++)
		{
			String value =sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
	}

}
