package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NORMAL_CLASS 

{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//to enter url on the wbepage
	driver.get("http://www.facebook.com");
	}

}
