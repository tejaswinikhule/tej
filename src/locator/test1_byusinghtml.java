package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_byusinghtml 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	// to initialize the browser or to open an application
	System.setProperty("webdriver.chrome.driver","F://VELOCITY CLASS//chromedriver.exe");
	
	//to create the object of chrome driver class
	   WebDriver driver= new ChromeDriver();
	    //wait
	   Thread.sleep(1000);
			
			// to open app
	   driver. get ("file:///F:/VELOCITY%20CLASS/AUTOMATION%20PART/id1.html");
	   // enter un
	  driver.findElement(By.id("abc123")).sendKeys("abc1");
	  //enter password
	  driver.findElement(By.id("abc456")).sendKeys("xyz124");
	
}
}