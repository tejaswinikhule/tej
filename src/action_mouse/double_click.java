package action_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//Step-I:Identify Button and store it into an object
	WebElement	button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
	//Step-II:Create object of Actions Class 
       Actions act=new Actions(driver);
	
	//To double click
       act.doubleClick(button).perform();
		
		
	}

}
