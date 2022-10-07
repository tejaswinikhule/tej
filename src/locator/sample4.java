package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
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
		//to clck on create new account
		driver.findElement(By.xpath("//a[contains (text(),'Create New Account']")).click();
		//wait
		Thread.sleep(2000);
          //by using index xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("tej");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("kadu");
		
		
		
		
		
	}

}
