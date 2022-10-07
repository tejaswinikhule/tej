package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox24 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
		   //upcasting
		    WebDriver driver=new ChromeDriver();
		    driver.get("file:///F:/VELOCITY%20CLASS/AUTOMATION%20PART/MultiselectableListbox.html");
		    //wait
		    Thread.sleep(20000);
		    // step 1: identify listbox fin address and store in an object
		    WebElement multiselectable =driver.findElement(By.xpath("//select[@id='1234']"));
		    //wait 
		    Thread.sleep(8000);
		    Select s1=new Select(multiselectable);
		    s1.selectByVisibleText("Sri");
		    Thread.sleep(8000);
		    //to get the selected option
		    
		    
		 WebElement options=   s1.getFirstSelectedOption();
		 Thread.sleep(8000);
		 //to get the text
		String txt=options.getText();
		System.out.println(txt);
	}

}
