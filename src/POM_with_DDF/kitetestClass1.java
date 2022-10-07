package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetestClass1 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(10000);
		//2. To perform action on component we need to call a methods.
         
		//create object of pom1 class
          kitelogin12 login1=new kitelogin12(driver);
         
          
          //take a data from excelsheet
          FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
         Sheet sh= WorkbookFactory.create(file).getSheet("Sheet8");
         String userid= sh.getRow(0).getCell(0).getStringCellValue();
          login1. userid(userid);
          
          String Password= sh.getRow(0).getCell(1).getStringCellValue();
          login1.password(Password);
          
          login1.loginbtn();
          
          Thread.sleep(10000);
          
          //create object of pom2 class
		  kitelogin23 login2=new kitelogin23(driver);
		  String PIN= sh.getRow(0).getCell(2).getStringCellValue();
		  login2.pin( PIN);
		  
		  
		  login2.ctnbtn();
		  
		  Thread.sleep(5000);
		  
		  //create object of pom3 class
		  kitehomepage1 homepage =new kitehomepage1( driver);
		  String expected= sh.getRow(0).getCell(3).getStringCellValue();
		   homepage.VerifyuserId(expected);
	
		
		
	}

}
