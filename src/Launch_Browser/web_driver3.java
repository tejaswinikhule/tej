package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//to enter url on webpage using navigation
		  driver.navigate().to("http://www.flipkart.com");
		  //wait
		  Thread.sleep(2000);
		  //to enter url on webpage//to open an application
		  driver.navigate().to("http://www.facebook.com");
		  //wait
		  Thread.sleep(5000);
		  
		  //to move backword
		  driver.navigate().back();
		  
		  //wait
		  Thread.sleep(3000);
		  
		  //to move forword
		  driver.navigate().forward();
		  //wait
		  Thread.sleep(5000);
		  
		  //to refresh webpage
		  driver.navigate().refresh();
	}

}
