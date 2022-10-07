package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3 {
	   //Fetch "Java"
		public static void main(String[] args) throws InterruptedException 
		{	
			System.setProperty("webdriver.chrome.driver", 
					"F:\\VELOCITY CLASS\\AUTOMATION PART\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			//To enter URL on the webpage/To open an application
			driver.get("file:///F:/VELOCITY%20CLASS/Table1.html");
			
			//wait
			Thread.sleep(2000);
			
			//Fetch "Java"
		 WebElement	Text=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]"));
		 Thread.sleep(20000);
		              String  S1=Text.getText();
		 
		            System.out.println(S1);
			
			
		}

}
