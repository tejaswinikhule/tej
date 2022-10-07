package POM_ddf_Testng_Baseclass_utilityclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_class
{
	public WebDriver driver;

	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//to enter url on the wbepage
		driver.get("http://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
