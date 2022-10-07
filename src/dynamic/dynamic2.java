package dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		//wait
		Thread.sleep(20000);
		
		// close the hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//wait
				Thread.sleep(20000);
				//to get  search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("real note 10 ");
		//wait
				Thread.sleep(10000);
				
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		//wait
		Thread.sleep(12000);
		WebElement rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'][1]//span)[8])"));
		           String d1=  rating.getText();
		           System.out.println(d1);
		           
		           Thread.sleep(10000);
		   		
		   		

}
}
