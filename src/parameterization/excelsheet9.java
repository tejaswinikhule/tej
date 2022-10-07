package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet9 
{
	private static final int LastCellIndex = 0;

	//to fetch particular column ======
			public static void main(String[] args) throws EncryptedDocumentException, IOException 
			{
				//to reach to the excelsheet
				FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
				Sheet sh=WorkbookFactory.create(file).getSheet("sheet6");
				
				//find last row index
				int LastRowIndex = sh.getLastRowNum();
				System.out.println(LastRowIndex);
				for(int i=0; i<=LastRowIndex; i++)
				{
					int LastCellIndex =sh.getRow(i).getLastCellNum()-1;
					
					//inner loop for cellcolumn
					
					for( int a = 0; a<=LastCellIndex; a++)
					{
						String info= sh.getRow(i).getCell(a).getStringCellValue();
						System.out.println(info);
					}
				
				}
			}
				
}
