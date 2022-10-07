package action_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action 
{         // customise listbox doesnt having select tagname
	      
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(25000);
		driver.findElement(By.xpath("//a[@ class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(27000);
		driver.findElement(By.id("day")).click();
		//cretae the object of action class and provide driver object chromedriver class into the constructor of action class
		Actions act= new Actions(driver);
		// arrow up key of keyboard move upword 1 step
		 act.sendKeys(Keys.ARROW_UP).perform();
		 
		 Thread.sleep(8000);
		 //arrow down keys move downword to 1 step 
		 
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(8000);
		 // go to the dirsct 1st step -> 1 date
		 act.sendKeys(Keys.HOME).perform();
		 Thread.sleep(8000);
		 //go to end date 30
		 act.sendKeys(Keys.END).perform();
		 Thread.sleep(8000);
		 // go the fix date  use loop
		 for(int i =1 ;i<=4; i++)
		 {
			 act.sendKeys(Keys.ARROW_UP).perform();

		 }
			Thread.sleep(2000);	 
		 //to select perticular feild
		 act.sendKeys(Keys.ENTER).perform();
		 
		
	driver.close();	
		
		
	}

}
