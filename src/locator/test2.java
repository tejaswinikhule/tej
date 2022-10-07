package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
	public static void main(String[] args) throws InterruptedException  
	{
		// to initialize the browser or to open an application
		System.setProperty("webdriver.chrome.driver","F://VELOCITY CLASS//chromedriver.exe");
		
		//to create the object of chrome driver class
		   WebDriver driver= new ChromeDriver();
		    //wait
		   Thread.sleep(2000);
		   driver. get ("file:///F:/VELOCITY%20CLASS/AUTOMATION%20PART/name1.html");
		   // enter un
		   driver.findElement(By.name("1234")).sendKeys("abc");
		   //enter psw
		   driver.findElement(By.name("5678")).sendKeys("xyz");
		
		
	}

}
