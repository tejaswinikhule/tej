package POM_ddf_Testng_Baseclass_utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class utility_class
{
	@Test
	//fetch//rad// retrive
	public static String getdatafromPF(String key) throws IOException
	{
		//to reacch upto propety file
		FileInputStream file=new FileInputStream("F:\\eclipse-workspace\\katraj_21_may\\src\\POM_ddf_Testng_Baseclass_utilityclass\\propertyfile");
		
		//create object of properties class
		Properties prop=new Properties();
		
		//to open propetyfile
		prop.load(file);
		
		//to fetch data
		String value1=prop.getProperty(key);
		
		return value1;
		
	}
	@Test
	//fetch data from excelshhet
	public static String getTD(int Rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		//to reach upto excelsheet

		//to reach to the excelsheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		//to  fetch the info
		Sheet sh =WorkbookFactory.create(file).getSheet("Sheet8");
			String value2=sh.getRow(Rowindex).getCell(cellindex).getStringCellValue();
			return value2;
	}
	@Test
	//to capture screenshot
	public static void CaptureScreenshot(WebDriver driver) throws InterruptedException, IOException
	{
		  File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    System.out.println(Source);

	        Thread.sleep(12000);
		    
		    File Destination =new File("F:\\VELOCITY CLASS\\AUTOMATION PART\\SCREENSHOT5.JPG");
		    FileHandler.copy(Source,  Destination);
		   	  
	}
	

}
