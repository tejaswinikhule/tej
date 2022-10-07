package practise_purpose;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dropdown 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\AUTOMATION PART\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		   driver.get("https://www.flipkart.com");
		   Thread.sleep(10000);
		   //close hidden divison
		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		   Thread.sleep(2000);
		   //search shoes
		   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("shoes");
		   Thread.sleep(8000);
		   //  click on search
			driver .findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			 Thread.sleep(8000);
			 //click on image
		    driver.findElement(By.xpath("(//div[@class='_1xHGtK _373qXS'])[1]")).click();
		    Thread.sleep(8000);
		    
		    //move to next window
		  Set<String> allid= driver.getWindowHandles();
		  ArrayList<String> a1=new ArrayList<String>(allid);
		 String childw=  a1.get(1);
		    
		    driver.switchTo().window(childw);
		    Thread.sleep(8000);
		    //click on size chart
		 
		    driver.findElement(By.xpath("//div[@class='_22QfJJ']//ul//li[2]//a")).click(); 
		    
	}
}
