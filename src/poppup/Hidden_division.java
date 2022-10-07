package poppup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division
{
	public static void main(String[] args) throws InterruptedException
	{

System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com");
		  
		  //wait  for 5 sec
		  Thread.sleep(25000);
		  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("5846556954");
		  Thread.sleep(15000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sfhjdfndkf");
		 
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  
	}

}
