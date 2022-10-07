package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 
{
	
@Test
	public void TC1() 
	{	
			System.setProperty("webdriver.chrome.driver", 
					"F:\\VELOCITY CLASS\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			//To enter URL on the webpage/To open an application
			driver.get("https://kite.zerodha.com");
			
	}

}
