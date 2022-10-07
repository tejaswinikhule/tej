package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//wAIT
		Thread.sleep(2000);
		
		Point p1 =new Point(300,400);
		driver.manage().window().setPosition(p1);
		
		

}
}
