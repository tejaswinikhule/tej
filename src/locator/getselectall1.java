package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getselectall1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		   //upcasting
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://www.facebook.com");
		    //wait
		    Thread.sleep(8000);
		 // click on create new account
			 driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
			 
			    Thread.sleep(10000);
			    
			    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			    
			    Thread.sleep(12000);
			    Select s1=new Select(month);
			    
			    Thread.sleep(14000);
			    List<WebElement> v2=s1.getOptions();
			    
			    Thread.sleep(16000);
			    
			    for(WebElement s4:v2) 
			    {
			    	System.out.println(s4.getText());
			    }
			    
			    
		
	}

}
