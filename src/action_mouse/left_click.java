package action_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class left_click 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(25000);
		
		//Close hidden division pop-up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//wait
		Thread.sleep(20000);
		
		
  //Step-I:Identify Cart(find Address of cart)and store it into an Object	
	WebElement	Cart=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
	Thread.sleep(20000);
	//Step-II:Create object of Actions Class 
       Actions act=new Actions(driver);
		
		//to perform left click 
       act.click(Cart).perform();
       
		
       
       
       
	}
	
	
	


}
