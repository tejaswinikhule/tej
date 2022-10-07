package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowsing1 
{
	@Test
	@Parameters("browserName")  //Chrome   //firefox
    //Test Case/Test Method
public void TC1(String browserName) throws InterruptedException 
{
WebDriver driver=null;

//Chrome         //Chrome
if(browserName.equals("Chrome")) 
{
System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\chromedriver.exe");

driver=new ChromeDriver();

} 
else if(browserName.equals("firefox")) 
{
System.setProperty("webdriver.chrome.driver", "F:\\VELOCITY CLASS\\geckodriver.exe");

driver=new FirefoxDriver();

}   


//To enter URL on the webpage/To open an application
driver.get("https://kite.zerodha.com");
Thread.sleep(10000);

}

}



