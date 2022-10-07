package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrow 
{
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", 
			"F:\\VELOCITY CLASS\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	//To enter URL on the webpage/To open an application
	driver.get("file:///F:/VELOCITY%20CLASS/Table1.html");
	
	//wait
	Thread.sleep(2000);
	
	// to get perticular row
	
	
	for (int i=1; i<=3; i++) 
	{
		WebElement s1=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td["+i+"]"));
		String text= s1.getText();
		System.out.print(text+" ");
		
	}  
	  
	}
}
