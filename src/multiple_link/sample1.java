package multiple_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{   // to get one type of element use this programe)
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(20000);
		//to get the text of all links  on the facebook  page
	List<WebElement>	AllLink=driver.findElements(By.xpath("//a"));
		for(WebElement link:AllLink)
		{
			System.out.println(link.getText());
		}
		
	}
}
