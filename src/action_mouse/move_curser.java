package action_mouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_curser
{
	 //Row size
		public static void main(String[] args) throws InterruptedException 
		{	
			System.setProperty("webdriver.chrome.driver", 
					"F:\\VELOCITY CLASS\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			//To enter URL on the webpage/To open an application
			driver.get("file:///F:/VELOCITY%20CLASS/Table1.html");
			
			//wait
			Thread.sleep(2000);
		
		      //Find all rows of webTable
			
		List<WebElement>  Rows=driver.findElements(By.xpath("//table[@id='1234']//tr"));
			
		             int  S1=Rows.size();
			            
			      System.out.println(S1);
		
		
		 
		
	}
	
	
	

}
