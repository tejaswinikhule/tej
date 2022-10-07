package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.facebook.com");
		
	}
}
