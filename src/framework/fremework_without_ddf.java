package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fremework_without_ddf 
{
		public static void main(String[] args) throws InterruptedException 
		{	
			System.setProperty("webdriver.chrome.driver", 
					"F:\\VELOCITY CLASS\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			//To enter URL on the webpage/To open an application
			driver.get("https://kite.zerodha.com");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			driver.manage().window().maximize();
		
		
		//Enter UserID
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("GP8097");
		
		//wait
			Thread.sleep(2000);
		
		//Enter Password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gms@0110");
		
		//wait
			Thread.sleep(2000);
		
		//Click login button
			driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		//wait
			Thread.sleep(2000);
			
		//Enter PIN
			driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("111000");
			//wait
			Thread.sleep(2000);
			
			//click Continue button
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
			  

}}
