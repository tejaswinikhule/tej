package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 
{
	public static void main(String[] args) 
	{

		// to initialize the browser or to open an application
		System.setProperty("webdriver.chrome.driver","F://VELOCITY CLASS//chromedriver.exe");
		
		//to create the object of chrome driver class
		   WebDriver driver= new ChromeDriver();
		    //wait
		  
		   driver. get("file:///F:/VELOCITY%20CLASS/AUTOMATION%20PART/linktext.html");
		   // enter un
		   
		   driver.findElement(By.linkText("facebook")).click();
		  
		
		
	
		  
		
	}

}
