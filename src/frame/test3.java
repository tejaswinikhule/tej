package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait
		Thread.sleep(5000);
		//To switch to frame(WebElement)
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
				
				//wait
				Thread.sleep(5000);
				
				//Click button
				driver.findElement(By.xpath("//button[@type='button']")).click();
				
				//To switch to main page
				driver.switchTo().parentFrame();
				
				//wait
				Thread.sleep(5000);
				
			
				//wait
			    Thread.sleep(5000);

				//Click Home Icon
			    driver.findElement(By.xpath("//a[@id='tryhome']")).click();
				
				
				
	}
	
	

}
