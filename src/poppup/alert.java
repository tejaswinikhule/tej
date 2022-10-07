package poppup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		
		//Enter customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
		
		//wait
		Thread.sleep(20000);
		
		//Click submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//wait
		Thread.sleep(20000);
				
		
		//To switch to Alert pop-up     ----- alert is a interface
		//change the focus of selenium main page to popup
	     Alert alt=driver.switchTo().alert();
		
	   //wait
		Thread.sleep(20000);
		
		//to click OK button
		 // alt.accept();
	     
	    // To click Cancel button
		alt.dismiss();
		
		
		
	}
	
	
}
		


