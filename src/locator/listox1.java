package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listox1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		   //upcasting
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://www.facebook.com");
		    //wait
		    Thread.sleep(2000);
		 // click on create new account
			 driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
			 
			    Thread.sleep(2000);
			    
			    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			    
			    Thread.sleep(12000);
			    Select s1=new Select(month);
			    Thread.sleep(15000);
			    		
			   // s1.selectByVisibleText("mar");
			    //s1.selectByIndex(1);
			    s1.selectByValue("4");
			    Thread.sleep(20000);
			    
			    
			    
		    
		    
		
	}

}
