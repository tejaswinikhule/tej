package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	   System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
	   //upcasting
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.facebook.com");
	    
	    Thread.sleep(9000);
	    //downcasting
	    
	    File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(Source);

        Thread.sleep(12000);
	    
	    File Destination =new File("F:\\VELOCITY CLASS\\AUTOMATION PART\\SCREENSHOT1.JPG");
	    FileHandler.copy(Source,  Destination);
	   	   
	}
	}