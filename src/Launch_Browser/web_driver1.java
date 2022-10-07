package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLAS\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		  driver.get("http://www.facebook.com");
		  
		  //wait  for 5 sec
		  Thread.sleep(5000);
		  
		  //to close the application
		  driver.close();
		 
	
		
		
		
		
		
		
		
		
		
	}

}
