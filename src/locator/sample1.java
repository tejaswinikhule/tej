package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException 
	{
			 //click create new account click//paramete1:- name of the browser(small letter)
		//parameter2:- path of the chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "F://VELOCITY CLASS//chromedriver.exe");
		
		//to  create object of chrome driver class
		WebDriver driver =new ChromeDriver();
		
		// to enter url on facebook/ to open an application
		driver.get("http://www.facebook.com");
		//wait for 5 second
		Thread.sleep(5000);
		
		//enter user name
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		//to enter password
		driver.findElement(By.xpath("//input[@name]'pass']")).sendKeys("xyz12");
		// driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
			

		

	}

}
