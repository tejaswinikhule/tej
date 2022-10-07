package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class sa2 
{
	   //Find column size of row 4
		public static void main(String[] args) throws InterruptedException 
		{	
			System.setProperty("webdriver.chrome.driver", 
					"F:\\VELOCITY CLASS\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			//To enter URL on the webpage/To open an application
			driver.get("file:///F:/VELOCITY%20CLASS/Table1.html");
			
			//wait
			Thread.sleep(2000);
			
			//Find column size of row 4
		List<WebElement>  Column=driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));
			
		       int  S2=Column.size();
		       System.out.println(S2);
		
		
			
		}

}
