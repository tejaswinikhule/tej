package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\AUTOMATION PART\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//wAIT
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
	}



}
