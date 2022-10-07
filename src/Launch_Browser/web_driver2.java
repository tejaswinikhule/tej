package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//to enter url on the wbepage
		driver.get("http://www.facebook.com");
		//wiat for 2 sec
		Thread.sleep(2000);
		//to close all the tabs of the browser
		  driver.quit();
		
		
		
	}

}
