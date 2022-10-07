package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aproach2
{
	public static void main(String[] args) throws InterruptedException
	{
		//paramete1:- name of the browser(small letter)
		//parameter2:- path of the chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "F://VELOCITY CLASS//chromedriver.exe");
		
		//to  create object of chrome driver class
		WebDriver driver =new ChromeDriver();
		
		// to enter url on facebook/ to open an application
		driver.get("http://www.facebook.com");
		//wait for 5 second
		Thread.sleep(2000);
		
		//enter user name
		//the address of findelement method is stored in un bject and return type is webelement
		WebElement un =driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("abc");
		Thread.sleep(5000);
		//to enter password
		//driver.findElement(By.xpath("//input[@name]'pass']")).sendKeys("xyz");
		//Thread.sleep(10000);
		//to clear
		//driver.findElement(By.xpath("//input[@name='email']")).clear();
		Thread.sleep(15000);
		un.clear();
        // to enter again un
		un.sendKeys("tyu");
		Thread.sleep(15000);
		//click on forgotten password
		driver.findElement(By.xpath("//a[text()='forgotten password?']")).click();
		

}
}
	
		
	
