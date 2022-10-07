package poppup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class window_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links");
		         
		        //implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		//wait
		Thread.sleep(2500);
				
		//click new Tab button
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
		//wait
		Thread.sleep(20000);
		
		Set<String>  AllIds=driver.getWindowHandles();
		
		ArrayList<String>  al=new ArrayList<String> (AllIds); //mainpageID, window ID
		
		//To get WindowID
		String ChildwindowID=al.get(1);
		
		
		//To switch to window
		driver.switchTo().window(ChildwindowID);
		
	
		
		//click Training link
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
	}
	

}
