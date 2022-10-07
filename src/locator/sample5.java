package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
	public static void main(String[] args) throws InterruptedException 
	{

		//paramete1:- name of the browser(small letter)
		//parameter2:- path of the chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","F://VELOCITY CLASS//chromedriver.exe");
		
		//to  create object of chrome driver class
		WebDriver driver =new ChromeDriver();
		
		// to enter url on facebook/ to open an application
		driver.get("http://www.facebook.com");
		//wait for 5 second
		 Thread.sleep(5000);
		//to create new account
		 driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
	
		 Thread.sleep(10000);
		// to enter first name
		
		 driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("tejaswini");
            
		 
		 Thread.sleep(20000);
		 
		 driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("kadu");
		 Thread.sleep(30000);
	}

}
