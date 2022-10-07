package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webtable1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		WebElement	dropdown=driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
           Actions act=new Actions(driver);
		
		//To move curser
		  act.moveToElement(dropdown).perform();
		//wait
			Thread.sleep(2000);
		
		 
	//	List<WebElement> s1=driver.findElements(By.xpath("//table[@class='_2WObml']// tr"));
		//System.out.println(s1);
	}

}
