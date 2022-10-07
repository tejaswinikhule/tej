package Launch_Browser;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		//wAIT
		Thread.sleep(2000);
		//to set the size of browser
		Dimension d1=new Dimension(200,300);
		driver.manage().window().setSize(d1);
		
		//to get size of browser
		Dimension size =driver.manage().window().getSize();
		System.out.println(size);
		
	}
}
