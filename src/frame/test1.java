package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	//to enter url on the wbepage
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		
		
	//wait
			Thread.sleep(20000);
			
			//To switch to frame(String Framename)
			driver.switchTo().frame("iframeResult");
			
			//wait
			Thread.sleep(25000);
			
			//Click button
			driver.findElement(By.xpath("//button[@type='button']")).click();
			

}
}