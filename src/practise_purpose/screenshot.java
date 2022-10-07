package practise_purpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();		
		
		Thread.sleep(25000);
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(5000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		File destination=new File("F:\\VELOCITY CLASS\\images\\fbSCREENSHOT1.JPG");
		FileHandler.copy(source, destination);
	}

}
