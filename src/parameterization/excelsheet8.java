package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet8 
{
	//to fetch particular column ======
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach to the excelsheet
			FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
			Sheet sh=WorkbookFactory.create(file).getSheet("sheet6");
			//find last cell index
			int LastRowIndex = sh.getLastRowNum();
			System.out.println(LastRowIndex);
			for(int i=0; i<=LastRowIndex; i++)
			{
				String value =sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(value);
			}
			
		}
}
