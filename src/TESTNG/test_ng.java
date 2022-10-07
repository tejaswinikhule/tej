package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_ng 
{
	@Test
	public void m1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//to enter url on the wbepage
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		
		
	}

}
