package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sroll_left_right
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/guru99home/");
	     Thread.sleep(10000);
	     driver. manage().window().maximize();
	     
		//identify element upto we have to scroll
	     WebElement view=driver.findElement(By.xpath("//div[@class='canvas-middle'])[6]"));
	     //scroll horizontally
	     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",view);
	     
	}
	     
}
