package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework_with_ddf
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://kite.zerodha.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
		//to reach upto excel sheet
		FileInputStream file=new FileInputStream("F:\\VELOCITY CLASS\\MANNUAL PART\\Sheet1.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet8");
		//enter user id
	    String	userid= sh.getRow(0).getCell(0).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(userid);
	    
	    //enter password
	    String password=sh.getRow(0).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    
	    //click login
	    driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter pin
	    String pin=sh.getRow(0).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("111000");
	    
	    //continue button
	    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		
	  //Verify UserID
		
		   String ExpectedUserID="GP8097";
			
			//identify Actual UserID
		 WebElement  UID=driver.findElement(By.xpath("//span[@class='user-id']"));
			  String  ActualUserID=UID.getText(); //GP8097
			
			
			  if(ExpectedUserID.equals(ActualUserID))  //GP8097  GP8097
			  {
				  System.out.println("Pass");
			  }
			  else 
			  {
				  System.out.println("Fail");
			  }
			  
	
	
		
	}

}
