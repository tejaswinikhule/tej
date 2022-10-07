package dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.filpkart.com");
		
		//wait
		Thread.sleep(10000);
		
		// close the hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//wait
				Thread.sleep(8000);
				//to get  search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("real note 10");
		//wait
				Thread.sleep(8000);
				
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		//wait
		Thread.sleep(10000);
		WebElement rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'][1]//span)[6])"));
		//wait
				Thread.sleep(10000);
		           String text=rating.getText();
		           System.out.println(text);
		      
		           Thread.sleep(10000);
		
		
		
		
		
		
	}

}
