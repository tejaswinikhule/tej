package action_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//Step-I:Identify element and store it into an object
	   WebElement	Source=driver.findElement(By.xpath("//a[text()=' 5000']"));
	   WebElement	Destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
	 //Step-II:Create object of Actions Class 
       Actions act=new Actions(driver);
		
		
       //To perform drag and drop
       act.dragAndDrop(Source,Destination).perform();
       
       
       
	}

}
