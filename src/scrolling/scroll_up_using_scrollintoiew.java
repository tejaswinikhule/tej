package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_using_scrollintoiew 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/guru99home/");
	     driver. manage().window().maximize();
	     Thread.sleep(5000);
	   //identify element upto we have to scroll
	     WebElement view1=driver.findElement(By.xpath("//a[text()='Facebook']"));
	     Thread.sleep(1000);
	     //scroll up to facebook webelement
	     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",view1);
	     
	}
	     

}
