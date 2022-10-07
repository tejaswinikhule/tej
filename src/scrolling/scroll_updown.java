package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_updown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://demo.guru99.com/test/guru99home/");
	     driver. manage().window().maximize();
	     Thread.sleep(5000);
		
	     //scroll down enter parameter +ve value
	     ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	     
	     Thread.sleep(5000);
	     
	     //scrll up enter 2nd parameter _ve  pixel value
	     ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-800)");

	}
		
	}


