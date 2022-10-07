package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectbox 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","F:\\VELOCITY CLASS\\chromedriver.exe");
	   //upcasting
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///F:/VELOCITY%20CLASS/AUTOMATION%20PART/MultiselectableListbox.html");
	    //wait
	    Thread.sleep(12000);
	    // step 1: identify listbox fin address and store in an object
	    WebElement multiselectable =driver.findElement(By.xpath("//select[@id='1234']"));
	    //wait 
	    Thread.sleep(12000);
	    //step 2: creATE object of select class
	    Select s1= new Select(multiselectable);
	    Thread.sleep(18000);
	    //step3: call the method 
	    s1.selectByVisibleText("Sri");
	    s1.selectByIndex(0);
	    Thread.sleep(20000);
	    //dselect method
	    s1.deselectByVisibleText("Sri");
	    s1.deselectByIndex(0);
}

}
