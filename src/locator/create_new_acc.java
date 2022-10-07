package locator;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class create_new_acc 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		   //upcasting
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://www.facebook.com");
		    //wait
		    Thread.sleep(24000);
		 // click on create new account
			 driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
			 Thread.sleep(21000);
		    //select firstname
			 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("teju");
			 Thread.sleep(22000);
			 //select lastname
			 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khule");
			 //emter mob no
			 Thread.sleep(24000);
			 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7890845278");
			 //enter passsword
			 Thread.sleep(26000);
			 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("asdd@12");
			 Thread.sleep(28000);
			 //enter birth date
			WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select s1=new Select(day);
			Thread.sleep(28000);
			s1.selectByIndex(9);
			//enter birth month
			WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
			Select s2=new Select(month);
			Thread.sleep(28000);
			s2.selectByIndex(2);
			//enter year
			WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
			Select s3=new Select(year);
			Thread.sleep(28000);
			s3.selectByVisibleText("1996");
			//enter female gender
			Thread.sleep(29000);
			driver.findElement(By.xpath("//input[@id='u_3_4_SE']")).click();
			
			
			
			//take screenshot
			
			File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 System.out.println(Source);
			Thread.sleep(12000);
		    
		    File Destination =new File("F:\\VELOCITY CLASS\\AUTOMATION PART\\SCREENSHOT1.JPG");
		    FileHandler.copy(Source,  Destination);
		   	   
			
			
			
		
			
	}

}
